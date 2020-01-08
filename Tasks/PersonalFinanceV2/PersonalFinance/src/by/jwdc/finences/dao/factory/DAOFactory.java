package by.jwdc.finences.dao.factory;

import by.jwdc.finences.bean.Operation;
import by.jwdc.finences.dao.IOperationDAO;
import by.jwdc.finences.dao.impl.FileOperationDAO;

public class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();

    private final IOperationDAO operationDAO = new FileOperationDAO();

    private DAOFactory(){}

    public static DAOFactory getInstance() {
        return instance;
    }

    public IOperationDAO getOperationDAO() {
        return operationDAO;
    }
}
