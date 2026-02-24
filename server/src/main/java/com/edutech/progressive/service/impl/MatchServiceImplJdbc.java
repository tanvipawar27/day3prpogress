package com.edutech.progressive.service.impl;

import com.edutech.progressive.dao.*;
import com.edutech.progressive.entity.*;
import com.edutech.progressive.service.*;
import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.entity.*;
import java.util.ArrayList;
import java.util.List;

public class MatchServiceImplJdbc implements MatchService {

    private MatchDAO matchDAO;

    public MatchServiceImplJdbc(MatchDAO matchDAO) {
        this.matchDAO = matchDAO;
    }

    @Override
    public List<Match> getAllMatches() {
        return new ArrayList<>();
    }

    @Override
    public Match getMatchById(int matchId) {
        return null;
    }

    @Override
    public Integer addMatch(Match match) {
        return -1;
    }

    @Override
    public void updateMatch(Match match) {
    }

    @Override
    public void deleteMatch(int matchId) {
    }
} 