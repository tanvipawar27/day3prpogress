package com.edutech.progressive.service.impl;


import com.edutech.progressive.entity.Cricketer;
import com.edutech.progressive.service.CricketerService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.edutech.progressive.dao.*;
import com.edutech.progressive.entity.*;
import com.edutech.progressive.service.*;
import java.util.ArrayList;
import java.util.List;


public class CricketerServiceImplArraylist implements CricketerService {

    private List<Cricketer> cricketers = new ArrayList<>();

    @Override
    public List<Cricketer> getAllCricketers() {
        return new ArrayList<>();
    }

    @Override
    public Integer addCricketer(Cricketer cricketer) {
            cricketers.add(cricketer);
        return 1;
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
        Collections.sort(cricketers);
        return cricketers;
    }

    @Override
    public void emptyArrayList() {
        cricketers.clear();
    }

    @Override
    public Cricketer getCricketerById(int cricketerId) {
        return null;
       
    }

    @Override
    public void updateCricketer(Cricketer cricketer) {
       
    }

    @Override
    public void deleteCricketer(int cricketerId) {
       
    }
}