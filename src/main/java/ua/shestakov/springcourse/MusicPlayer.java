package ua.shestakov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    @Autowired
    @Qualifier("classicalMusic")
    private Music music;



    public String playMusic() {
            return "Playing: " + music.getSong();
    }
}
