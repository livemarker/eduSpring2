package lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MusicPlayer {
    @Autowired
    @Qualifier("rockMusic")
    private Music music;
    @Value("${musicPlayer.name}")
private  String name;
    @Value("${musicPlayer.volume}")
private int volume;

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }


    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {

        System.out.println("Playing: " + music.getSong());

    }

}
