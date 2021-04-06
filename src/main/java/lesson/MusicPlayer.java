package lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("rockMusic")
    private Music music;


//    public MusicPlayer(Music music) {
//        this.music = music;
//    }


    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {

        System.out.println("Playing: " + music.getSong());

    }

}
