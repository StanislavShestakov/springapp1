package ua.shestakov.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



@Component
@Scope("prototype")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInint(){
        System.out.println("Do my Inint");
    }

    @PreDestroy
    public  void doMyDestroy(){
        System.out.println("Do my Destroy");
    }

    @Override
    public String getSong() {
        return "bohemian rapsody";
    }

}
