package pasu.projects.palindrome.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import pasu.projects.palindrome.model.Input;
import pasu.projects.palindrome.repository.PalindromeRepo;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

@RestController
public class PalindromeController {

    private final PalindromeRepo palindromeRepo;

    public PalindromeController(PalindromeRepo palindromeRepo) {
        this.palindromeRepo = palindromeRepo;
    }

    @GetMapping("/api/inputs")
    List<Input> findAll(){
        return palindromeRepo.findAll();
    }

    @GetMapping("/api/inputs/{id}")
    Input findById(@PathVariable Integer id) {
        Optional <Input> input = palindromeRepo.findById(id);
        if (input.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No such Id");
        }
        return input.get();
    }

    @GetMapping("/api/check/{userInput}")
    String checkPalindrome(@PathVariable String userInput) {
        System.out.println("User Input is " + userInput);
        try {
            final Pattern pattern = Pattern.compile("^[A-Za-z ]++$");
            if ((null != userInput) && (pattern.matcher(userInput).matches())) {
                StringBuilder strRev = new StringBuilder(userInput.toLowerCase());
                strRev.reverse();
                if (userInput.contentEquals(strRev))
                    return "This is Palindrome";
                else
                    return "This is not Palindrome";
            } else {
                throw new IllegalArgumentException("Invalid input string");
            }
        } catch(Exception e){
            System.out.println("Exception throw :  " + e);
        }
        return "Exception thrown";
    }
}
