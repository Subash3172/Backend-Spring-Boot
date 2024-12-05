package org.techm.codingchallenges.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.techm.codingchallenges.entity.Teams;
import org.techm.codingchallenges.service.TeamsService;
 
 
 
@RestController
public class TeamsController {
 
    @Autowired
    TeamsService teamsService;
   
    @PostMapping("/teams")
    public ResponseEntity<String> saveTeams(@RequestBody Teams team){
    	teamsService.saveall(team);
    	return new ResponseEntity<String>("Added",HttpStatus.OK);
    }
    @GetMapping(path = "/teams/winning-teams")
    public ResponseEntity<List<Teams>> getAllWinningTeams(){
       List<Teams> winningTeams = teamsService.getAllTeams().stream().filter(team -> team.getTargetRuns()<=team.getRuns()).collect(Collectors.toList());;
       if(winningTeams.isEmpty()) {
    	   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
       return new ResponseEntity<>(winningTeams,HttpStatus.OK);
 
    }
   
    @GetMapping(path = "/teams/team-2013")
    public ResponseEntity<List<Teams>> getTeamsIn2013(){
       List<Teams> team_2013 = teamsService.getAllTeams().stream().filter(team -> team.getYear()==2013).toList();
       if(!team_2013.isEmpty()) {
           return new ResponseEntity<List<Teams>>(team_2013, HttpStatus.OK);

       }
	   return new ResponseEntity<List<Teams>>(HttpStatus.NOT_FOUND);
    }
 
    @GetMapping("/")
    public ResponseEntity<String> getMessage(){
 
        return new ResponseEntity<>("Hello World!!!", HttpStatus.OK);
    }
 
}