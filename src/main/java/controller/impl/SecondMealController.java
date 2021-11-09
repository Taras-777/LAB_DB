package controller.impl;

import model.dao.impl.AbstractGenericDaoImpl;
import model.dao.impl.SecondMealDaoImpl;
import model.entities.SecondMeal;

public class SecondMealController extends AbstractGenericControllerImpl<SecondMeal> {
    private final SecondMealDaoImpl secondMealDao = new SecondMealDaoImpl();

    @Override
    public AbstractGenericDaoImpl<SecondMeal> getDao() {
        return secondMealDao;
    }
}
