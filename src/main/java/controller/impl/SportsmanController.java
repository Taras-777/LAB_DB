package controller.impl;

import model.dao.impl.AbstractGenericDaoImpl;
import model.dao.impl.SportsmanDaoImpl;
import model.entities.Sportsman;

public class SportsmanController extends AbstractGenericControllerImpl<Sportsman>{
    private final SportsmanDaoImpl sportsmanDao = new SportsmanDaoImpl();

    @Override
    public AbstractGenericDaoImpl<Sportsman> getDao(){
        return sportsmanDao;
    }



}
