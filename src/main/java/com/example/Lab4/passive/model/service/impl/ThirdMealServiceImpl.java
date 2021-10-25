package com.example.Lab4.passive.model.service.impl;

import com.example.Lab4.passive.model.dao.Impl.ThirdMealDaoImpl;
import com.example.Lab4.passive.model.entities.ThirdMealEntity;
import com.example.Lab4.passive.model.service.Service;

public class ThirdMealServiceImpl extends AbstractService<ThirdMealEntity,Integer> implements Service<ThirdMealEntity, Integer> {
    public ThirdMealServiceImpl(){
        super(new ThirdMealDaoImpl());
    }
}
