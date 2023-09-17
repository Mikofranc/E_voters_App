package org.example.service;

import org.example.data.models.HouseOfRep;

import java.util.List;

public interface HouseOfRepService {
    HouseOfRep vote(int vote);
    List<String> displayParties();

}
