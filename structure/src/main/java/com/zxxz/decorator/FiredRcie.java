package com.zxxz.decorator;

/**
 * @author zhangxun_a
 * @date 2022/9/25 16:39
 * @description: 炒饭
 */
public class FiredRcie extends FastFood {

    public FiredRcie() {
        super(10, "炒饭");
    }

    @Override
    public float cast() {
        return getPrice();
    }
}
