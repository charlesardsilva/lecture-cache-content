package dev.charlesardsilva.lecturecachecontent.gateway;

import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@Component
public class ReviewGateway {

    public int rating(long productId) {
        try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Random().nextInt(0,5);
    }
}