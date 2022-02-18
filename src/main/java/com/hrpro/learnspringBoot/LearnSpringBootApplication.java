package com.hrpro.learnspringBoot;

import com.hrpro.learnspringBoot.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
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
