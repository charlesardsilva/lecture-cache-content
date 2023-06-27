package dev.charlesardsilva.lecturecachecontent.gateway;

import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@Component
public class StudentGateway {

    public int amountOfStudents(String productId) {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new Random().nextInt();
    }
}
