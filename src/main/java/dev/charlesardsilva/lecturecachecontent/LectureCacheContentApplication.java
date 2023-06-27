package dev.charlesardsilva.lecturecachecontent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class LectureCacheContentApplication {

	public static void main(String[] args) {
		SpringApplication.run(LectureCacheContentApplication.class, args);
	}

}
