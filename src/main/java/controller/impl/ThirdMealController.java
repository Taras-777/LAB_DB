package controller.impl;

import model.dao.impl.AbstractGenericDaoImpl;
import model.dao.impl.ThirdMealDaoImpl;
import model.entities.ThirdMeal;

public class ThirdMealController extends AbstractGenericControllerImpl<ThirdMeal>{

    private final ThirdMealDaoImpl thirdMealDao = new ThirdMealDaoImpl();

    @Override
    public AbstractGenericDaoImpl<ThirdMeal> getDao(){
        return thirdMealDao;
    }
}
