package com.zhechu.limit.enums;

/**
 * 限流注解
 */
public enum LimitType {

    /**
     * 自定义key
     */
    CUSTOMER,

    /**
     * 请求者IP
     */
    IP;
}