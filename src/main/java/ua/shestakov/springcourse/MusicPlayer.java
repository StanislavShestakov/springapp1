package ua.shestakov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music;

    @Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void playMusic() {
            System.out.println("Playing: " + music.getSong());
    }
}
