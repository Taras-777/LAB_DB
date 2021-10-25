package com.example.Lab4.passive.controller.impl;


import com.example.Lab4.passive.controller.Controller;
import com.example.Lab4.passive.model.entities.FirstMealEntity;
import com.example.Lab4.passive.model.service.impl.FirstMealServiceImpl;

public class FirstMealTypeControllerImpl extends AbstractController<FirstMealEntity,Integer> implements Controller<FirstMealEntity, Integer> {
    public FirstMealTypeControllerImpl(){
        super(new FirstMealServiceImpl());
    }
}
