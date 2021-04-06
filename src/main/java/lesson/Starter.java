package lesson;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Starter {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);

//
//        Music music = context.getBean("classicalMusic", Music.class);
//        MusicPlayer player = new MusicPlayer(ClassicalMusic);
//        player.playMusic();
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic();
        System.out.println(player.getName());
        System.out.println(player.getVolume());
//        Computer computer=context.getBean("computer",Computer.class);
//        System.out.println(computer);
        context.close();
    }

}
