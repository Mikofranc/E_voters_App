package org.example.service;

import org.example.data.models.Governorship;
import org.example.data.models.Parties;
import org.example.data.models.Presidency;
import org.example.data.repo.GovernorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GovernorServiceImpl implements GovernorService{
    private final List<String> parties = List.of(
            "APC","PDP","ANPP","LP","APGA","APP","YDP","NNPP","ADC"
    );
    @Autowired
    private GovernorRepo governorRepo;
    @Override
    public Governorship vote(int vote) {
        Governorship governorship = new Governorship();
        governorship.setParty(String.valueOf(Parties.valueOf(displayParties().get(vote-1))));
        governorship.setVoted(true);
        return governorRepo.save(governorship);
    }
    @Override
    public List<String> displayParties() {
        return parties;
    }
}
