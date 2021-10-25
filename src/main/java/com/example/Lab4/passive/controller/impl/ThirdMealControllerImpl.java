package com.example.Lab4.passive.controller.impl;


import com.example.Lab4.passive.controller.Controller;
import com.example.Lab4.passive.model.entities.ThirdMealEntity;
import com.example.Lab4.passive.model.service.impl.ThirdMealServiceImpl;

public class ThirdMealControllerImpl extends AbstractController<ThirdMealEntity,Integer> implements Controller<ThirdMealEntity, Integer> {
    public ThirdMealControllerImpl(){
        super(new ThirdMealServiceImpl());
    }
}
