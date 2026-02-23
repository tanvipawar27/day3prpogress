package com.edutech.progressive.service.impl;


import entity.Cricketer;
import service.CricketerService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CricketerServiceImplArrayList implements CricketerService {

    private List<Cricketer> cricketers = new ArrayList<>();

    @Override
    public List<Cricketer> getAllCricketers() {
        return new ArrayList<>();
    }

    @Override
    public Integer addCricketer(Cricketer cricketer) {
        return -1;
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
        return new ArrayList<>();
    }

    @Override
    public void emptyArrayList() {
        cricketers.clear();
    }
}