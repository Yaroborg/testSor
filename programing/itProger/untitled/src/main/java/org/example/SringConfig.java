package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration

@PropertySource("classpath:musicPlayer.properties")
public class SringConfig {

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(rockMusic(), classicalMusic());
    }
    @Bean
    public Computer computer(MusicPlayer musicPlayer) {
        return new Computer(musicPlayer);
    }
}
