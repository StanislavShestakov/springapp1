package ua.shestakov.springcourse;

import org.springframework.stereotype.Component;



public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "bohemian rapsody";
    }

}
