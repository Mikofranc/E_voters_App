package org.example.service;

import org.example.data.models.Parties;
import org.example.data.models.Presidency;
import org.example.data.repo.PresidencyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PresidencyServiceImpl implements PresidencyService{
    @Autowired
    private PresidencyRepo presidencyRepo;

    private final List<String> parties = List.of(
            "APC","PDP","ANPP","LP","APGA","APP","YDP","NNPP","ADC"
    );

    @Override
    public Presidency vote(int vote) {
        Presidency presidency = new Presidency();
        presidency.setParty(String.valueOf(Parties.valueOf(displayParties().get(vote-1))));
        presidency.setVoted(true);
        return presidencyRepo.save(presidency);
    }

    @Override
    public List<String> displayParties() {
        return parties;
    }

}
