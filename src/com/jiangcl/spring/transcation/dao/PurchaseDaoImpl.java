package com.jiangcl.spring.transcation.dao;

import com.jiangcl.spring.transcation.annotation.ResultValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author jiangcl
 * @date 2019/12/23
 * @desc dao实现类
 */
@Repository(value = "purchaseDao")
public class PurchaseDaoImpl implements PurchaseDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void updateBookCount(int num, int id) {
        String sql = "UPDATE book SET count = count - "+ num +" WHERE id = " + id;
        jdbcTemplate.update(sql);
    }

    @Override
    public void updateUserRemaining(int num, int userId) {
        String sql = "UPDATE `user` SET remaining = remaining - "+ num +" WHERE userId = " + userId;
        jdbcTemplate.update(sql);
    }

    @ResultValue("book")
    @Override
    public int getBookCount(Integer id) {
        String sql = "SELECT count FROM book WHERE id = " + id;
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @ResultValue("user")
    @Override
    public int getUserRemaining(Integer userId) {
        String sql = "SELECT remaining FROM `user` WHERE userId = " + userId;
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }
}
