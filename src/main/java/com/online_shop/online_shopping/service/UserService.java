package com.online_shop.online_shopping.service;

import com.online_shop.online_shopping.model.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    public List<UserDetails> userList(){
        return Arrays.asList(
                new UserDetails(1,"amol","amol@test.com"),
                new UserDetails(2,"renuka","renuka@gmail.com")
        );
    }
}
