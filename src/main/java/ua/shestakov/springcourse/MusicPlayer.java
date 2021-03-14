package ua.shestakov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    public MusicPlayer() {}

    public void playMusic() {
            System.out.println("Playing: " + classicalMusic.getSong());
    }
}
