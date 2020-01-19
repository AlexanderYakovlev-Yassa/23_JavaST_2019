package by.jwdc.finances.service;

import by.jwdc.finances.bean.bean.FinanceOperation;
import by.jwdc.finances.dao.exception.DAOException;

import java.util.HashSet;

public interface IServiceLogic {

    HashSet<FinanceOperation> getAllFinanceOperation() throws DAOException;

    boolean addFinanceOperation(FinanceOperation financeOperation);
}
