package controller.impl;

import model.dao.impl.AbstractGenericDaoImpl;
import model.dao.impl.DietDaoImpl;
import model.entities.Diet;

public class DietController extends AbstractGenericControllerImpl<Diet>{

    private final DietDaoImpl dietDao = new DietDaoImpl();

    @Override
    public AbstractGenericDaoImpl<Diet> getDao(){
        return dietDao;
    }
}
