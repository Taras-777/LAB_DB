package controller.impl;

import model.dao.impl.AbstractGenericDaoImpl;
import model.dao.impl.NutritionistDaoImpl;
import model.entities.Nutritionist;

public class NutritionistController extends AbstractGenericControllerImpl<Nutritionist> {
    private final NutritionistDaoImpl nutritionistDao = new NutritionistDaoImpl();

    @Override
    public AbstractGenericDaoImpl<Nutritionist> getDao(){
        return nutritionistDao;
    }

}
