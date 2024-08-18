package pasu.projects.palindrome.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import pasu.projects.palindrome.model.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class PalindromeRepo {

    private final List<Input> inputStrings = new ArrayList<>();

    public List<Input> findAll() {
        return inputStrings;
    }

    public Optional<Input> findById(Integer id) {
        return inputStrings.stream()
                .filter(inputString -> Objects.equals(inputString.id(), id)).findFirst();
    }

    @PostConstruct
    private void init(){
        inputStrings.add(new Input(1, "AMMA", true));
        inputStrings.add(new Input(2, "APPA", true));
        inputStrings.add(new Input(3, "AKKA", true));
        inputStrings.add(new Input(4, "ANNA", true));
    }
}
