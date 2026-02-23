package com.edutech.progressive.dao;

import entity.Team;
import java.util.ArrayList;
import java.util.List;

public class TeamDAOImpl implements TeamDAO {

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
    public List<Team> getAllTeams() {
        return new ArrayList<>();
    }
}