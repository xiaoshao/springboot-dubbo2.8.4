package com.service;

import com.boot.domain.User;
import com.boot.service.TestService;

public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String str) {
        return "hhi " + str;
    }

    @Override
    public User findUser() {
        User user = new User();

        user.setAge(10);
        user.setGender(2);
        user.setId(3);
        user.setUsername("test");
        user.setPassword("password");

        return user;
    }
}
