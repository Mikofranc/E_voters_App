package org.example.service;

import org.example.data.repo.PresidencyRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PresidencyServiceImplTest {
    @Autowired
    private  PresidencyService presidencyService;
    @Autowired
    private PresidencyRepo presidencyRepo;
    @Test
    public void  testToVotePresidency(){
        presidencyService.vote(2);
        assertEquals(presidencyRepo.count(), 1);
    }
    @Test
    public void displayAllParties(){
        var parties = presidencyService.displayParties();
        parties.forEach(System.out::println);
    }

}