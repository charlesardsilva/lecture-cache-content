package dev.charlesardsilva.lecturecachecontent.repository;

import dev.charlesardsilva.lecturecachecontent.model.Config;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

@Repository
public class ConfigRepository {

    public Config findByKey(String key) {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new Config("showOtherProducts", false);
    }
}
