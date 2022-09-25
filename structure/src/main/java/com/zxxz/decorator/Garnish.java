package com.zxxz.decorator;

/**
 * @author zhangxun_a
 * @date 2022/9/25 16:43
 * @description: 抽象装饰者角色
 */
public abstract class Garnish extends FastFood{

    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
