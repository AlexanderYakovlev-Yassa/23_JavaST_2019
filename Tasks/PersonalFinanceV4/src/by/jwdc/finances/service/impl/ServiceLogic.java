package by.jwdc.finances.service.impl;

import by.jwdc.finances.bean.bean.FinanceOperation;
import by.jwdc.finances.dao.DAOFactory;
import by.jwdc.finances.dao.IDAOLogic;
import by.jwdc.finances.dao.exception.DAOException;
import by.jwdc.finances.service.IServiceLogic;

import java.util.ArrayList;
import java.util.HashSet;

public class ServiceLogic implements IServiceLogic {

    private static final DAOFactory DAO_FACTORY = DAOFactory.getInstance();
    private static final IDAOLogic DAO_LOGIC = DAO_FACTORY.getDaoLogic();

    public HashSet<FinanceOperation> getAllFinanceOperation() throws DAOException {

        HashSet<FinanceOperation> res = null;

        try {
            res = DAO_LOGIC.getFinanceOperation();
        } catch (DAOException e) {
            throw new DAOException("Cant get list of finance operations", e);
        }

        return res;
    }

    @Override
    public boolean addFinanceOperation(FinanceOperation financeOperation) {



        return false;
    }


}
