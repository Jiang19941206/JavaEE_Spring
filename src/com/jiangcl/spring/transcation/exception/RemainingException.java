package com.jiangcl.spring.transcation.exception;

/**
 * @author jiangcl
 * @date 2019/12/23
 * @desc 余额不足异常
 */
public class RemainingException extends RuntimeException {
    public RemainingException(String message) {
        super(message);
    }
}
