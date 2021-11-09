package controller.impl;

import model.dao.impl.AbstractGenericDaoImpl;
import model.dao.impl.CoachDaoImpl;
import model.entities.Coach;

public class CoachController extends AbstractGenericControllerImpl<Coach>{

    private final CoachDaoImpl coachDao = new CoachDaoImpl();

    @Override
    public AbstractGenericDaoImpl<Coach> getDao(){
        return coachDao;
    }
}
