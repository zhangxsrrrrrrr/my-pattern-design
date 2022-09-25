package com.zxxz.decorator.support;

import com.zxxz.decorator.FastFood;
import com.zxxz.decorator.Garnish;

/**
 * @author zhangxun_a
 * @date 2022/9/25 16:47
 * @description: 培根配料
 */
public class Bacon extends Garnish {
    public Bacon(FastFood fastFood) {
        super(2, "培根", fastFood);
    }

    @Override
    public float cast() {
        return getPrice() + getFastFood().cast();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "    " + getFastFood().getDesc();
    }
}
