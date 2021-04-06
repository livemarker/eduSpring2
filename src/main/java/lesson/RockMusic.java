package lesson;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
    @PostConstruct
    public void doMyInit(){
        System.out.println("initialization \n");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("destroy \n");
    }
}
