package epha.demoYange.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner  commandLineRunner(
            StudentRepository repository){
        return args-> {
            Student mariam = new Student(
            "mariam",
            "mariam@gmail.com",
             LocalDate.of(2000,JANUARY, 5)
           );

            Student Ephaste = new Student(
                    "Ephste",
                    "Ephaste@gmail.com",
                    LocalDate.of(1999,DECEMBER, 7)
            );
            repository.saveAll(
                    List.of(mariam, Ephaste)
            );
        };
    }
}