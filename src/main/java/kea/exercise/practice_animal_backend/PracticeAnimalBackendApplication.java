package kea.exercise.practice_animal_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class PracticeAnimalBackendApplication {


    public static void main(String[] args) {
        SpringApplication.run(PracticeAnimalBackendApplication.class, args);
        System.out.println("Hello World");
    }




}
