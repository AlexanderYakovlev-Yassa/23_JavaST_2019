package by.jwdc.finances.dao;

import by.jwdc.finances.bean.FinanceOperation;
import by.jwdc.finances.dao.exception.FinanceOperationDAOException;

import java.util.ArrayList;

public interface IFinanceOperationDAO {

    boolean addFinanceOperation(FinanceOperation operation) throws FinanceOperationDAOException;
    boolean hasFinanceOperationInBase(FinanceOperation operation) throws FinanceOperationDAOException;
    void rewriteAllFinanceOperation(ArrayList<FinanceOperation> allOperations) throws FinanceOperationDAOException;
    //boolean removeOperation(FinanceOperation operation);
    //boolean clear();

    ArrayList<FinanceOperation> getAllFinanceOperations() throws FinanceOperationDAOException;

    //ArrayList<FinanceOperation> getAllExpenseOperation();
    //ArrayList<FinanceOperation> getAllIncomingOperation();

    //ArrayList<FinanceOperation> getAllOperationsForThePeriod(Date minDate, Date maxDate);



}
