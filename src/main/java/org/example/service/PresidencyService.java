package org.example.service;

import org.example.data.models.Presidency;

import java.util.List;

public interface PresidencyService {
    Presidency vote(int vote);
    List<String> displayParties();
}
