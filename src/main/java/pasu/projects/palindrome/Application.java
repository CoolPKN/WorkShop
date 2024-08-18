package pasu.projects.palindrome;

import java.util.Scanner;
import java.io.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pasu.projects.palindrome.model.Input;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.info("Application Palindrome Started Successfully");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your username: ");
		String userName = scanner.nextLine();
		log.info("Hello {}, Welcome to Palindrome-Check Project.", userName );

		System.out.println("Enter your String to validate Palindrome: ");
		String inputString = scanner.nextLine();
		inputString=inputString.toLowerCase();

		StringBuilder strRev = new StringBuilder(inputString);
		strRev.reverse();

		if (inputString.contentEquals(strRev))
			log.info("Hello {}, {} is Palindrome", userName, inputString);
		else
			log.info("Hello {}, {} is Not a Palindrome", userName, inputString);
		}

    }


//	@Bean
//  CommandLineRunner getInputValue(String inputString) {
//		return args -> {
//			Input input = new Input(1, inputString);
//            log.info("Input String is : {}", input);
//		};
//	}

