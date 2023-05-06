package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.adaptee.WavAudio;
import org.springframework.cloud.pattern.adapter.AdapterPlayer;
import org.springframework.cloud.pattern.target.Mp3Player;

/**
 * Unit test for simple App.
 */
@SpringBootTest
class AppTest {
    @Test
    void test() {
        WavAudio wavAudio = new WavAudio().wav("c:\\audio\\1.wav");
        Mp3Player mp3Player = new AdapterPlayer(wavAudio);
        mp3Player.play();
        System.out.println(mp3Player);
    }
}
