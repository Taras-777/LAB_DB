package com.example.Lab4.passive.model.service.impl;

import com.example.Lab4.passive.model.dao.Impl.FirstMealDaoImpl;
import com.example.Lab4.passive.model.entities.FirstMealEntity;
import com.example.Lab4.passive.model.service.Service;

public class FirstMealServiceImpl extends AbstractService<FirstMealEntity,Integer> implements Service<FirstMealEntity, Integer> {
    public FirstMealServiceImpl(){
        super(new FirstMealDaoImpl());
    }
}
