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
}
