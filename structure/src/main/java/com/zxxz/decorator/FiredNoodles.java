package com.zxxz.decorator;

/**
 * @author zhangxun_a
 * @date 2022/9/25 16:41
 * @description: 炒面
 */
public class FiredNoodles extends FastFood{
    public FiredNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cast() {
        return getPrice();
    }
}
