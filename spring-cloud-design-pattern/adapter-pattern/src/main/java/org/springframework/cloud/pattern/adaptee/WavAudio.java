package org.springframework.cloud.pattern.adaptee;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.pattern.resource.AudioType;

/**
 * @author zhy
 * @date 2022/3/7 11:17
 */
@Getter
public class WavAudio {
    private String fileName;
    private AudioType audioType;

    public WavAudio wav(String fileName) {
        if (StringUtils.isBlank(fileName)) {
            return this;
        }
        int index = fileName.lastIndexOf(".");
        if (index <= 0) {
            return this;
        }
        String fileType = fileName.substring(index);
        if (AudioType.WAV.getName().equals(fileType)) {
            this.fileName = fileName;
            this.audioType = AudioType.WAV;
        }
        return this;
    }
}
