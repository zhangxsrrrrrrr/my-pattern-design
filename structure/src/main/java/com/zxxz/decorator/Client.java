package com.zxxz.decorator;

import com.zxxz.decorator.support.Bacon;
import com.zxxz.decorator.support.Egg;

/**
 * @author zhangxun_a
 * @date 2022/9/25 16:51
 * @description: 实验点
 */
public class Client {
    public static void main(String[] args) {
        FastFood food = new FiredRcie();
        System.out.println(food.getDesc() + " " + food.getPrice());


        System.out.println("=========================");

        // 在上面的炒饭加上鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cast());

        System.out.println("=========================");
        food = new Bacon(food);
        System.out.println(food.getDesc() + " " + food.cast());

    }
}
