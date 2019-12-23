package com.jiangcl.spring.transcation.dao;

/**
 * @author jiangcl
 * @date 2019/12/23
 * @desc dao层
 */
public interface PurchaseDao {

    /**
     * @desc 修改商品数量
     * @author jiangcl
     * @date 2019/12/23
     * @param id
     * @return void
     */
    void updateBookCount(int num,int id);

    /**
     * 修改用户余额
     * @param userId
     */
    void updateUserRemaining(int num, int userId);

    /**
     * @desc 获取商品数量
     * @author jiangcl
     * @date 2019/12/23
     * @param id
     * @return int
     */
    int getBookCount(int id);

    /**
     * @desc 获取账户余额
     * @author jiangcl
     * @date 2019/12/23
     * @param userId
     * @return int
     */
    int getUserRemaining(int userId);
}
