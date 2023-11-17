package com.naresh.service;

import com.naresh.entity.Voter;
import com.naresh.repo.VoterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoterService {

    @Autowired
    private VoterRepository voterRepository;

    public List<Voter> getAllVoters() {
        return voterRepository.findAll();
    }

    public Voter saveVoter(Voter voter) {
        return voterRepository.save(voter);
    }

    public void deleteVoter(Long id) {
        voterRepository.deleteById(id);
    }

    public Voter updateVoter(Long id, Voter voter) {
        voter.setVoterId(id);
        return voterRepository.save(voter);
    }
}
