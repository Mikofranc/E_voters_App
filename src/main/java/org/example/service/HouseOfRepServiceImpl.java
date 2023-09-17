package org.example.service;

import org.example.data.models.Governorship;
import org.example.data.models.HouseOfRep;
import org.example.data.models.Parties;
import org.example.data.repo.HouseOfRepRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HouseOfRepServiceImpl implements HouseOfRepService{
    private final List<String> parties = List.of(
            "APC","PDP","ANPP","LP","APGA","APP","YDP","NNPP","ADC"
    );
    @Autowired
    private HouseOfRepRepo houseOfRepRepo;
    @Override
    public HouseOfRep vote(int vote) {
        HouseOfRep houseOfRep = new HouseOfRep();
        houseOfRep.setParty(String.valueOf(Parties.valueOf(displayParties().get(vote-1))));
        houseOfRep.setVoted(true);
        return houseOfRepRepo.save(houseOfRep);
    }

    @Override
    public List<String> displayParties() {
        return parties;
    }
}
