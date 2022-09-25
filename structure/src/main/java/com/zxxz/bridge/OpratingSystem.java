package com.zxxz.bridge;

/**
 * @author zhangxun_a
 * @date 2022/9/25 19:33
 * @description: 抽象化
 */
public abstract class OpratingSystem {
    protected VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    /**
     * 播放文件
     * @param fileName
     */
    public abstract void play(String fileName);
}
