import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Starter {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

      // Music music = context.getBean("musicBean", Music.class);
      //  MusicPlayer player = new MusicPlayer(music);
        MusicPlayer player=context.getBean("musicPlayer",MusicPlayer.class);
        player.playMusic();
        System.out.println(player.getName()+"\n"+player.getVolume());
        context.close();
    }

}
