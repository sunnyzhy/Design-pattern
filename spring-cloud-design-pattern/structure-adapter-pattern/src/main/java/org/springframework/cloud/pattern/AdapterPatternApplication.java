package org.springframework.cloud.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.pattern.adaptee.WavAudio;
import org.springframework.cloud.pattern.adapter.AdapterPlayer;
import org.springframework.cloud.pattern.target.Mp3Player;

/**
 * @author zhy
 * @date 2022/3/3 8:53
 */
@SpringBootApplication
public class AdapterPatternApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdapterPatternApplication.class, args);

        WavAudio wavAudio = new WavAudio().wav("c:\\audio\\1.wav");
        Mp3Player mp3Player = new AdapterPlayer(wavAudio);
        mp3Player.play();
        System.out.println(mp3Player);
    }
}
