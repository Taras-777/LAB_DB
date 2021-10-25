package com.example.Lab4.passive.controller.impl;

import com.example.Lab4.passive.controller.Controller;
import com.example.Lab4.passive.model.entities.CoachEntity;
import com.example.Lab4.passive.model.service.impl.CoachServiceImpl;

public class CoachControllerImpl extends AbstractController<CoachEntity,Integer> implements Controller<CoachEntity, Integer> {
    public CoachControllerImpl(){
        super(new CoachServiceImpl());
    }
}
