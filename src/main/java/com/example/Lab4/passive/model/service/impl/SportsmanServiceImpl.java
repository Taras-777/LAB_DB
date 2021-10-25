package com.example.Lab4.passive.model.service.impl;

import com.example.Lab4.passive.model.dao.Impl.SportsmanDaoImpl;
import com.example.Lab4.passive.model.entities.SportsmanEntity;
import com.example.Lab4.passive.model.service.Service;

public class SportsmanServiceImpl extends AbstractService<SportsmanEntity,Integer> implements Service<SportsmanEntity, Integer> {
    public SportsmanServiceImpl(){
        super(new SportsmanDaoImpl());
    }
}
