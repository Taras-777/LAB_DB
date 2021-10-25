package com.example.Lab4.passive.model.service.impl;

import com.example.Lab4.passive.model.dao.Impl.SecondMealDaoImpl;
import com.example.Lab4.passive.model.entities.SecondMealEntity;
import com.example.Lab4.passive.model.service.Service;

public class SecondMealServiceImpl extends AbstractService<SecondMealEntity,Integer> implements Service<SecondMealEntity, Integer> {
    public SecondMealServiceImpl(){
        super(new SecondMealDaoImpl());
    }
}
