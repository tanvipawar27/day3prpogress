package com.edutech.progressive.service.impl;


import com.edutech.progressive.dao.TeamDAO;
import com.edutech.progressive.entity.Team;
import com.edutech.progressive.service.TeamService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeamServiceImplJdbc implements TeamService {

    private TeamDAO teamDAO;

    public TeamServiceImplJdbc(TeamDAO teamDAO) {
        this.teamDAO = teamDAO;
    }

    @Override
    public List<Team> getAllTeams() {
        return teamDAO.getAllTeams();
    }

    @Override
    public int addTeam(Team team) {
        return 1;
    }

    @Override
    public Team getTeamById(int teamId) {
        return null;
    }

    @Override
    public void updateTeam(Team team) {
    }

    @Override
    public void deleteTeam(int teamId) {
    }

    @Override
    public List<Team> getAllTeamsSortedByName() {
        // TODO Auto-generated method stub
        List<Team> t=teamDAO.getAllTeams();
        Collections.sort(t);
        return t;
    // throw new UnsupportedOperationException("Unimplemented method 'getAllTeamsSortedByName'");
    }
}