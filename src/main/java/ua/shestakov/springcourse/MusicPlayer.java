package ua.shestakov.springcourse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {


    private List<Music> musicList = new ArrayList<>();
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }



    public MusicPlayer(List<Music> list) {
      this.musicList = list;

    }

    public String playMusic() {
        Random r = new Random();
        Music music = musicList.get(r.nextInt(musicList.size()));
        return "Playing: " + music.getSong();
    }
}
