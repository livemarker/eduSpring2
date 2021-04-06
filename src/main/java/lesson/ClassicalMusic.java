package lesson;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
