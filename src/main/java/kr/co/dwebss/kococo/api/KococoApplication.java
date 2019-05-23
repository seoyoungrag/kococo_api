package kr.co.dwebss.kococo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class KococoApplication {

    public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.yml,"
            + "/app/config/kococo_api/real-application.yml";
    
	public static void main(String[] args) {
		SpringApplication.run(KococoApplication.class, args);
	}

}
