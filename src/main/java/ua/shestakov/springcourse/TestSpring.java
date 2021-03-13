package ua.shestakov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        context.close();
       // ClassicalMusic classicalMusic1 = new ClassicalMusic();
        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);
/*
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        firstMusicPlayer.playMusic();

        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());

        context.close();
        boolean comparsion = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparsion);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(70);
        System.out.println(secondMusicPlayer.getVolume());*/

    }
}
