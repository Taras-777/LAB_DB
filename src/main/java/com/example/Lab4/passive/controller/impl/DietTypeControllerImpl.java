package com.example.Lab4.passive.controller.impl;


import com.example.Lab4.passive.controller.Controller;
import com.example.Lab4.passive.model.entities.DietTypeEntity;
import com.example.Lab4.passive.model.service.impl.DietTypeServiceImpl;

public class DietTypeControllerImpl extends AbstractController<DietTypeEntity,Integer> implements Controller<DietTypeEntity, Integer> {
    public DietTypeControllerImpl(){
        super(new DietTypeServiceImpl());
    }
}
