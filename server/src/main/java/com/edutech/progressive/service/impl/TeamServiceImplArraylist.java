package com.edutech.progressive.service.impl;

import com.edutech.progressive.entity.Team;
import com.edutech.progressive.service.TeamService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class TeamServiceImplArraylist implements TeamService {

    private List<Team> teams = new ArrayList<>();

    @Override
    public List<Team> getAllTeams() {
        return teams;
    }

    @Override
    public int addTeam(Team team) {
        teams.add(team);
        return 1;
    }

    @Override
    public List<Team> getAllTeamsSortedByName() {
// List<Team> t=teamDAO.getAllTeams();
        Collections.sort(teams);
        return teams;
    }

    @Override
    public void emptyArrayList() {
        teams.clear();
    }
}