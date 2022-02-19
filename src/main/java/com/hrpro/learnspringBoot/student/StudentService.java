package com.hrpro.learnspringBoot.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "ahmed",
                        "ahmed9@example.com",
                        LocalDate.of(1995, Month.JUNE, 23),
                        26
                )
        );
    }
}
