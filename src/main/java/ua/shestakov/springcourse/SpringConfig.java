package ua.shestakov.springcourse;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public  RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public  JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public  ListGenre listGenre(){
        return new ListGenre(rockMusic(),jazzMusic(),classicalMusic());
    }

    @Bean
    public  MusicPlayer musicPlayer(){
        return  new MusicPlayer(listGenre().getListGenre());
    }

    @Bean
    public Computer computer(){
      return new Computer(musicPlayer());
    }
}
