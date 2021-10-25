package com.example.Lab4.passive.model.service.impl;

import com.example.Lab4.passive.model.dao.Impl.SupplementsDaoImpl;
import com.example.Lab4.passive.model.entities.SupplementsEntity;
import com.example.Lab4.passive.model.service.Service;

public class SupplementsServiceImpl extends AbstractService<SupplementsEntity,Integer> implements Service<SupplementsEntity, Integer> {
    public SupplementsServiceImpl(){
        super(new SupplementsDaoImpl());
    }
}
