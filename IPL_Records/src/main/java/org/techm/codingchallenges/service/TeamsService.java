package org.techm.codingchallenges.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techm.codingchallenges.entity.Teams;
import org.techm.codingchallenges.repository.TeamsRepository;

@Service
public class TeamsService {
	
	@Autowired
	TeamsRepository teamsRepo;
	
	public List<Teams> getAllTeams() {
		return teamsRepo.findAll();
	}

	public List<Teams> getWinningTeams() {
		return teamsRepo.findAll().stream().filter(team -> team.getTargetRuns()<=team.getRuns()).collect(Collectors.toList());
	}
	public List<Teams> getTeams2013(){
		return teamsRepo.findAll().stream().filter(team -> team.getYear()==2013).toList();
	}

	public void saveall(Teams team) {
		teamsRepo.save(team);
	}

}