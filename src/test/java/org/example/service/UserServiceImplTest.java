package org.example.service;

import org.example.data.repo.UserRepo;
import org.example.dto.RegisterRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepo userRepo;
    @Test
    public void testToRegisterUser(){
        RegisterRequest request =new RegisterRequest();
        request.setLastName("Francis");
        request.setPassword("1234");
        request.setEmail("micheal@gmail.com");
        request.setFirstName("mike");
        request.setAge(19);
        request.setNationality("nigerian");
        userService.register(request);
        assertThat(userRepo.count(),is(1L));
    }

}