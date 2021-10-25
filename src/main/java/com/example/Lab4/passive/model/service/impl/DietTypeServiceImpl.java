package com.example.Lab4.passive.model.service.impl;

import com.example.Lab4.passive.model.dao.Impl.TransportTypeDaoImpl;
import com.example.Lab4.passive.model.entities.DietTypeEntity;
import com.example.Lab4.passive.model.service.Service;

public class DietTypeServiceImpl extends AbstractService<DietTypeEntity,Integer> implements Service<DietTypeEntity, Integer> {
    public DietTypeServiceImpl(){
        super(new TransportTypeDaoImpl());
    }
}
