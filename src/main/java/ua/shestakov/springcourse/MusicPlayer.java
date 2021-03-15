package ua.shestakov.springcourse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Qualifier
    private List<String> music1;
    private List<String> music2;
    public enum Genre{ROCK,CLASSICAL}
    private Genre genre;


    public MusicPlayer(@Qualifier("rockMusic") RockMusic music1, @Qualifier("classicalMusic") ClassicalMusic music2) {
        this.music1 = music1.getSong();
        this.music2 = music2.getSong();
    }

    public String playMusic(Genre genre) {
          Random r = new Random();
         if(genre.equals(Genre.ROCK))
             return music1.get(r.nextInt(music1.size()));
         else
             return music2.get(r.nextInt(music2.size()));

    }
}
