package dev.charlesardsilva.lecturecachecontent.gateway;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class StudentGateway {

    public int amountOfStudents(long productId) {
        try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // colocar random
        return  10;
    }
}
