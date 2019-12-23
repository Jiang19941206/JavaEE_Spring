package com.jiangcl.spring.transcation.exception;

/**
 * @author jiangcl
 * @date 2019/12/23
 * @desc 库存不足异常
 */
public class StockException extends RuntimeException {

    public StockException(String message) {
        super(message);
    }
}
