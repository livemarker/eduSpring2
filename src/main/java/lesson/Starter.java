package lesson;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Starter {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//
//        Music music = context.getBean("classicalMusic", Music.class);
//        MusicPlayer player = new MusicPlayer(ClassicalMusic);
//        player.playMusic();
MusicPlayer player=context.getBean("musicPlayer",MusicPlayer.class);
player.playMusic();
//        Computer computer=context.getBean("computer",Computer.class);
//        System.out.println(computer);
        context.close();
    }

}
