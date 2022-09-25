package com.zxxz.decorator;

/**
 * 快餐类
 * 抽象构建的角色
 */
public abstract class FastFood {
    private float price;
    private String desc;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood() {
    }

    public abstract float cast();
}
