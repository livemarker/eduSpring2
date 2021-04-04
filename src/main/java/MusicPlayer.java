import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer() {
    }

    public void playMusic() {
        for (int i = 0; i <musicList.size(); i++) {

            System.out.println("Playing: " + musicList.get(i).getSong());
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
