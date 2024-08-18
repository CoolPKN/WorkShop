package pasu.projects.palindrome;

import java.util.Objects;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.info("Application Palindrome Started Successfully");

		// Get UserName
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your username: ");
		String userName = scanner.nextLine();
		log.info("Hello {}, Welcome to Palindrome-Check Project.", userName);

		//Get input string - which is not null
		String inputString;
		do {
			System.out.println("Enter your word or phrase: ");
			while (true){
				inputString = scanner.nextLine();
				if (!inputString.matches("[a-zA-Z0-9 ]+")){
					System.out.println("please dont enter any special characters!!");
					continue;
				} else if ((inputString.length() > 100)){
					System.out.println("Long string");
					continue;
				} else {
					log.info("your word is {} , ", inputString);
					break;
				}
			}
		}
		while (Objects.requireNonNull(inputString).isEmpty());

		inputString = inputString.toLowerCase();
		StringBuilder strRev = new StringBuilder(inputString);
		strRev.reverse();

		if (inputString.contentEquals(strRev))
			log.info("Hello {}, {} is Palindrome", userName, inputString);
		else
			log.info("Hello {}, {} is Not a Palindrome", userName, inputString);

		System.out.println("Palindrome Check is completed!!!");
	}
}

