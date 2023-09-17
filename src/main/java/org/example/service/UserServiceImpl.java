package org.example.service;

import org.example.data.models.User;
import org.example.data.repo.UserRepo;
import org.example.dto.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;
    @Override
    public void register(RegisterRequest request) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy hh:mm:ss");
        User user = new User();
        user.setAge(request.getAge());
        user.setEmail(request.getEmail());
        user.setDateCreated(LocalDateTime.now().format(formatter));
        user.setNationality(request.getNationality());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setPhoneNumber(request.getPhoneNumber());
        userRepo.save(user);

    }
}
