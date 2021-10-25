package com.example.Lab4.passive.controller.impl;

import com.example.Lab4.passive.controller.Controller;
import com.example.Lab4.passive.model.entities.NutritionistEntity;
import com.example.Lab4.passive.model.service.impl.NutritionistServiceImpl;

public class NutritionistControllerImpl extends AbstractController<NutritionistEntity,Integer> implements Controller<NutritionistEntity, Integer> {
    public NutritionistControllerImpl(){
        super(new NutritionistServiceImpl());

    }
}
