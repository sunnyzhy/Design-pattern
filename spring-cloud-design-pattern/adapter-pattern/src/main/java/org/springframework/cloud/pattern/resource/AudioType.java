package org.springframework.cloud.pattern.resource;

/**
 * @author zhy
 * @date 2022/3/7 11:14
 */
public enum AudioType {
    FLAC(0, ".flac"),
    WAV(1, ".wav"),
    MP3(2, ".mp3");

    private int code;
    private String name;

    AudioType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
