package controller.impl;

import model.dao.impl.AbstractGenericDaoImpl;
import model.dao.impl.FirstMealDaoImpl;
import model.entities.FirstMeal;

public class FirstMealController extends AbstractGenericControllerImpl<FirstMeal>{
    private final FirstMealDaoImpl firstMealDao = new FirstMealDaoImpl();

    @Override
    public AbstractGenericDaoImpl<FirstMeal> getDao(){
        return firstMealDao;
    }
}
