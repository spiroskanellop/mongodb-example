package com.mongo.springmongo;

import com.mongo.springmongo.entity.Address;
import com.mongo.springmongo.entity.Gender;
import com.mongo.springmongo.entity.Student;
import com.mongo.springmongo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class SpringMongoApplication {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(StudentRepository studentRepository){
//		return args -> {
//			Address address = new Address(
//					"Greece",
//					"Athens",
//					"12345"
//			);
//			Student student = new Student("S","k","spyros@email.com", Gender.MALE,
//					address,
//					List.of("IT"), BigDecimal.TEN, LocalDateTime.now());
//
//			studentRepository.save(student);
//		};
//	}
}
