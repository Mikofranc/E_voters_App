package org.example.service;

import org.example.data.repo.GovernorRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class GovernorServiceImplTest {
    @Autowired
    private GovernorService governorService;
    @Autowired
    private GovernorRepo governorRepo;
    @Test
    public void testToVote(){
        var x =governorService.vote(1);
        System.out.println(x);
        assertEquals(governorRepo.count(), 1);
    }

}