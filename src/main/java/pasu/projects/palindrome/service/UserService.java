package pasu.projects.palindrome.service;

import org.springframework.stereotype.Service;
import pasu.projects.palindrome.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//@Service
//public class UserService {
//
//    private List<User> userList;
//
//    public UserService() {
//        userList = new ArrayList<>();
//
//        User user1 = new User(1, "admin");
//        User user2 = new User(2, "russ");
//        User user3 = new User(3, "pasu");
//        User user4 = new User(3, "user");
//
//        userList.addAll(Arrays.asList(user1, user2, user3, user4));
//
//    }
//
//    public Optional<User> getUser(String userName) {
//        Optional optional = Optional.empty();
//        for (User user: userList) {
//            if (userName.equals(user.getUsername())){
//                optional = Optional.of(user);
//                return optional;
//            }
//        }
//        return optional;
//    }
//}
