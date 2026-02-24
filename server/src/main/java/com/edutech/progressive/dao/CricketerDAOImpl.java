package com.edutech.progressive.dao;

import com.edutech.progressive.entity.*;
import java.util.ArrayList;
import java.util.List;

public class CricketerDAOImpl implements CricketerDAO {

    @Override
    public int addCricketer(Cricketer cricketer) {
        return -1;
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

    @Override
    public List<Cricketer> getAllCricketers() {
        return new ArrayList<>();
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCricketersSortedByExperience'");
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
    }

   
}