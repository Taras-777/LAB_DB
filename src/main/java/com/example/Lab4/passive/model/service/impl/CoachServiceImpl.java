package com.example.Lab4.passive.model.service.impl;


import com.example.Lab4.passive.model.dao.Impl.CoachDaoImpl;
import com.example.Lab4.passive.model.entities.CoachEntity;
import com.example.Lab4.passive.model.service.Service;

public class CoachServiceImpl extends AbstractService<CoachEntity,Integer> implements Service<CoachEntity, Integer> {
    public CoachServiceImpl(){
        super(new CoachDaoImpl());
    }
}
