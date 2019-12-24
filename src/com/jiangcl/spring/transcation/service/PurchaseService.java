package com.jiangcl.spring.transcation.service;

/**
 * @author jiangcl
 * @date 2019/12/23
 * @desc service层
 */
public interface PurchaseService {

    /**
     * @desc 卖书
     * @author jiangcl
     * @date 2019/12/23
     * @param bookId
     * @param userId
     * @param bookNum
     * @return void
     */
    void purchaseBook(int bookId, int userId, int bookNum);

    int getInfo();
}
