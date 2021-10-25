package com.example.Lab4.passive.controller.impl;

import com.example.Lab4.passive.controller.Controller;
import com.example.Lab4.passive.model.entities.SportsmanEntity;
import com.example.Lab4.passive.model.service.impl.SportsmanServiceImpl;

public class SportsmanControllerImpl extends AbstractController<SportsmanEntity,Integer> implements Controller<SportsmanEntity, Integer> {
    public SportsmanControllerImpl(){
        super(new SportsmanServiceImpl());
    }
}
