package com.edutech.progressive.service.impl;


import dao.TeamDAO;
import entity.Team;
import service.TeamService;

import java.util.ArrayList;
import java.util.List;

public class TeamServiceImplJdbc implements TeamService {

    private TeamDAO teamDAO;

    public TeamServiceImplJdbc(TeamDAO teamDAO) {
        this.teamDAO = teamDAO;
    }

    @Override
    public List<Team> getAllTeams() {
        return new ArrayList<>();
    }

    @Override
    public int addTeam(Team team) {
        return -1;
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
}