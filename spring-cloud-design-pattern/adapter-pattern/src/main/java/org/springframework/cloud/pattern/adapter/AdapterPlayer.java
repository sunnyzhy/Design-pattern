package org.springframework.cloud.pattern.adapter;

import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.pattern.adaptee.WavAudio;
import org.springframework.cloud.pattern.resource.AudioType;
import org.springframework.cloud.pattern.target.Mp3Player;

/**
 * @author zhy
 * @date 2022/3/7 11:31
 */
public class AdapterPlayer implements Mp3Player{
    private String fileName;
    private AudioType audioType;
    private WavAudio wavAudio;

    public AdapterPlayer(WavAudio wavAudio) {
        this.wavAudio = wavAudio;
    }

    @Override
    public void play() {
        String fileName = wavAudio.getFileName();
        if (StringUtils.isBlank(fileName)) {
            return;
        }
        if (AudioType.WAV.getCode() == wavAudio.getAudioType().getCode()) {
            // convert wav to mp3
            // TODO ...
            this.fileName = fileName.replace(wavAudio.getAudioType().getName(), AudioType.MP3.getName());
            this.audioType = AudioType.MP3;
            System.out.println(String.format("convert %s to %s", fileName, this.fileName));
        } else {
            System.out.println("invalid audio: " + wavAudio.getAudioType().getName() + " format not supported");
        }
    }

    @Override
    public String toString() {
        return "Mp3Adapter{" +
                "fileName='" + fileName + '\'' +
                ", audioType=" + audioType +
                '}';
    }
}
