package org.example.service;

import org.example.data.models.Governorship;
import org.example.data.models.Presidency;

import java.util.List;

public interface GovernorService {
    Governorship vote(int vote);
    List<String> displayParties();
}
