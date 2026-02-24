package com.edutech.progressive.service.impl;

import com.edutech.progressive.entity.*;
import com.edutech.progressive.dao.*;
import com.edutech.progressive.entity.*;
import com.edutech.progressive.service.*;

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

    @Override
    public List<Team> getAllTeamsSortedByName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllTeamsSortedByName'");
    }
}