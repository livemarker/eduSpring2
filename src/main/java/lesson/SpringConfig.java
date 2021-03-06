package lesson;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("lesson")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();

    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(rockMusic());
    }
}
