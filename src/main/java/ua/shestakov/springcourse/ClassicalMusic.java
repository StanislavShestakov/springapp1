package ua.shestakov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ClassicalMusic implements Music {

    List<String> listMusic = new ArrayList<>();

    public ClassicalMusic() {
        listMusic.add("Lune Sonata");
        listMusic.add("Bohemian Rapsody");
        listMusic.add("Sun Sonata");
    }

    @Override
    public List<String> getSong() {
        return listMusic;
    }

}
