package com.zxxz.bridge;

/**
 * @author zhangxun_a
 * @date 2022/9/25 19:31
 * @description: Rmvb文件
 */
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件：" + fileName);
    }
}
