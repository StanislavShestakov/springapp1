package ua.shestakov.springcourse;

import org.springframework.stereotype.Component;


public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Smock on the water!";
    }
}
