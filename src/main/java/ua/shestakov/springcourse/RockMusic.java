package ua.shestakov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    List<String> listMusic = new ArrayList<>();

    public RockMusic() {
        listMusic.add("Smoke on the water!");
        listMusic.add("Rain fall down");
        listMusic.add("Deat night warrior");
    }

    @Override
    public List<String> getSong() {
        return listMusic;
    }
}
