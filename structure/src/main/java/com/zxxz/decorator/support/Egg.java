package com.zxxz.decorator.support;

import com.zxxz.decorator.FastFood;
import com.zxxz.decorator.Garnish;

/**
 * @author zhangxun_a
 * @date 2022/9/25 16:47
 * @description: 鸡蛋配料
 */
public class Egg extends Garnish {
    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public float cast() {
        return getPrice() + super.getFastFood().cast();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "    " + getFastFood().getDesc();
    }
}
