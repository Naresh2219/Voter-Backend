package com.naresh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.naresh.entity.Voter;
import com.naresh.service.VoterService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/voters")
public class VoterController {

    @Autowired
    private VoterService voterService;
 
    @GetMapping
    public List<Voter> getVoters() {
        return voterService.getAllVoters();
    }

    @PostMapping
    public Voter createVoter(@RequestBody Voter voter) {
        return voterService.saveVoter(voter);
    }

    @PutMapping("/{id}")
    public Voter updateVoter(@PathVariable Long id, @RequestBody Voter voter) {
        return voterService.updateVoter(id, voter);
    }

    @DeleteMapping("/{id}")
    public void deleteVoter(@PathVariable Long id) {
        voterService.deleteVoter(id);
    }
}
