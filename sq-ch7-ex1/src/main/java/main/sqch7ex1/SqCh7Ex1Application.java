package main.sqch7ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
public class SqCh7Ex1Application {

	public static void main(String[] args) {
		SpringApplication.run(SqCh7Ex1Application.class, args);
		int integer = 3 / 2;
		System.out.println(integer);
	}

}
