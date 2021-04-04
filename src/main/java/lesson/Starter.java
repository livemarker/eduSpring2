package lesson;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Starter {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        Music music = context.getBean("classicalMusic", Music.class);
        MusicPlayer player = new MusicPlayer(music);
        player.playMusic();
        context.close();
    }

}
