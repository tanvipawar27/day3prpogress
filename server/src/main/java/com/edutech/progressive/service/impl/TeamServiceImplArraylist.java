package com.edutech.progressive.service.impl;
import com.edutech.progressive.dao.*;
import com.edutech.progressive.entity.*;
import com.edutech.progressive.service.*;

import java.util.ArrayList;
import java.util.List;

public class TeamServiceImplArraylist implements TeamService {

    private List<Team> teams = new ArrayList<>();

    @Override
    public List<Team> getAllTeams() {
        return new ArrayList<>();
    }

    @Override
    public int addTeam(Team team) {
        return -1;
    }

    @Override
    public List<Team> getAllTeamsSortedByName() {
        return new ArrayList<>();
    }

    @Override
    public void emptyArrayList() {
        teams.clear();
    }
}