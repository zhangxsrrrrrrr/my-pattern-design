package com.zxxz.bridge;

/**
 * @author zhangxun_a
 * @date 2022/9/25 19:31
 * @description: Avi文件
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("Avi视频文件：" + fileName);
    }
}
