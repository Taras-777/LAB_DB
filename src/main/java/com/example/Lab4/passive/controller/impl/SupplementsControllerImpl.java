package com.example.Lab4.passive.controller.impl;


import com.example.Lab4.passive.controller.Controller;
import com.example.Lab4.passive.model.entities.SupplementsEntity;
import com.example.Lab4.passive.model.service.impl.SupplementsServiceImpl;

public class SupplementsControllerImpl extends AbstractController<SupplementsEntity,Integer> implements Controller<SupplementsEntity, Integer> {
    public SupplementsControllerImpl(){
        super(new SupplementsServiceImpl());
    }
}
