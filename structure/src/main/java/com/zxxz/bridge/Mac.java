package com.zxxz.bridge;

/**
 * @author zhangxun_a
 * @date 2022/9/25 19:34
 * @description: Mac操作系统（扩展抽象化角色）
 */
public class Mac extends OpratingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
