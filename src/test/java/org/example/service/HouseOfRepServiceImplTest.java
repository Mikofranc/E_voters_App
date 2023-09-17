package org.example.service;

import org.example.data.repo.HouseOfRepRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class HouseOfRepServiceImplTest {
    @Autowired
    private HouseOfRepService houseOfRepService;
    @Autowired
    private HouseOfRepRepo houseOfRepRepo;
    @Test
    public void testToVote(){
        var x = houseOfRepService.vote(1);
        System.out.println(x);
        assertEquals(houseOfRepRepo.count(), 1);
    }


}