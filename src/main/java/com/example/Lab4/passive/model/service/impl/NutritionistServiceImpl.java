package com.example.Lab4.passive.model.service.impl;

import com.example.Lab4.passive.model.dao.Impl.NutritionistDaoImpl;
import com.example.Lab4.passive.model.entities.NutritionistEntity;
import com.example.Lab4.passive.model.service.Service;

public class NutritionistServiceImpl extends AbstractService<NutritionistEntity,Integer> implements Service<NutritionistEntity, Integer> {
    public NutritionistServiceImpl(){
        super( new NutritionistDaoImpl());
    }
}
