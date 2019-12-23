package com.jiangcl.spring.transcation.service;

import com.jiangcl.spring.transcation.dao.PurchaseDao;
import com.jiangcl.spring.transcation.exception.RemainingException;
import com.jiangcl.spring.transcation.exception.StockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jiangcl
 * @date 2019/12/23
 * @desc service实现类
 */
@Service("purchaseService")
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    private PurchaseDao purchaseDao;

    /**
     * @desc 卖书（将单价固定为35）
     * @author jiangcl
     * @date 2019/12/23
     * @param bookId 商品id
     * @param userId 用户id
     * @param bookNum 购买的数量
     * @return void
     */
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void purchaseBook(int bookId, int userId, int bookNum) {
        //查询库存
        int bookCount = purchaseDao.getBookCount(bookId);
        //查询余额
        int remaining = purchaseDao.getUserRemaining(userId);
        //更新库存
        purchaseDao.updateBookCount(bookNum,bookId);
        //更新余额
        purchaseDao.updateUserRemaining((bookNum * 35),userId);

        //将异常放在后面，便于观察有事务和没有事务时的数据库更新情况
        //如果余额小于需要支付的金额则抛出余额不足
        if(remaining < (bookNum * 35)){
            throw new RemainingException("余额不足！");
        }
        //如果库存少于购买量则抛出库存不足
        if(bookCount < bookNum){
            throw new StockException("库存不足！");
        }
    }
}
