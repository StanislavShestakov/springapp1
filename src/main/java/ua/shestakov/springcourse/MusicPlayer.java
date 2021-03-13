package ua.shestakov.springcourse;

import org.springframework.beans.factory.support.ManagedList;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {



    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

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

    // IoC
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {}

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (Music m:musicList
             ) {
            System.out.println("Playing: " + m.getSong());
        }

    }
}
