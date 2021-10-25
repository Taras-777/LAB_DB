package com.example.Lab4.passive.controller.impl;


import com.example.Lab4.passive.controller.Controller;
import com.example.Lab4.passive.model.entities.SecondMealEntity;
import com.example.Lab4.passive.model.service.impl.SecondMealServiceImpl;

public class SecondMealControllerImpl extends AbstractController<SecondMealEntity,Integer> implements Controller<SecondMealEntity, Integer> {
    public SecondMealControllerImpl(){
        super(new SecondMealServiceImpl());
    }

}
