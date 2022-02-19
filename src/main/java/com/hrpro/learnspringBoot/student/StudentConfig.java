package com.hrpro.learnspringBoot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student ahmed = new Student(
                    "ahmed",
                    "ahmed9@example.com",
                    LocalDate.of(1995, Month.JUNE, 23)
            );

            Student sara = new Student(
                    "sara",
                    "sara@example.com",
                    LocalDate.of(1998, Month.APRIL, 4)
            );

            studentRepository.saveAll(List.of(ahmed, sara));
        };
    }
}
