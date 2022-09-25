package com.zxxz.bridge;

/**
 * @author zhangxun_a
 * @date 2022/9/25 19:37
 * @description: TODO
 */
public class Client {
    public static void main(String[] args) {
        VideoFile videoFile = new AviFile();
        // 创建mac系统对象
        OpratingSystem mac = new Mac(videoFile);
        mac.play("喜喜");
    }
}
