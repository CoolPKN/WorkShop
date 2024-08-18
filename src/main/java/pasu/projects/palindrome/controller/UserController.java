package pasu.projects.palindrome.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pasu.projects.palindrome.model.User;
//import pasu.projects.palindrome.service.UserService;

import java.util.Optional;

@RestController
public class UserController {
//
//    private final UserService userService;
//
//    public UserController(UserService userService){
//        this.userService = userService;
//    }
//
//    @GetMapping("/UserName")
//    public User getUser(@RequestParam String userName){
//        Optional user = userService.getUser(userName);
//        if (user.isPresent())
//            return (User) user.get();
//        return null;
//    }
//
}
