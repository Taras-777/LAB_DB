package controller.impl;

import model.dao.impl.AbstractGenericDaoImpl;
import model.dao.impl.SupplementsDaoImpl;
import model.entities.Supplements;

public class SupplementsController extends AbstractGenericControllerImpl<Supplements>{
    private final SupplementsDaoImpl supplementsDao = new SupplementsDaoImpl();

    @Override
    public AbstractGenericDaoImpl<Supplements> getDao(){
        return supplementsDao;
    }
}
