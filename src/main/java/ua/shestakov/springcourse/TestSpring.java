package ua.shestakov.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
          MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());


        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer);


        context.close();
    }
}
