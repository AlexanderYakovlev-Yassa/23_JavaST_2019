package by.jwdc.finences.dao;

import by.jwdc.finences.bean.Operation;
import by.jwdc.finences.dao.exception.OperationDAOException;

import java.util.ArrayList;

public interface IOperationDAO {

    //boolean addOperation(Operation operation);
    //boolean removeOperation(Operation operation);
    //boolean clear();

    //boolean addOperationType(String type);
    //boolean removeOperationType(String type);

    ArrayList<Operation> getAllOperations() throws OperationDAOException;

    //ArrayList<Operation> getAllExpenseOperation();
    //ArrayList<Operation> getAllIncomingOperation();

    //ArrayList<Operation> getAllOperationsForThePeriod(Date minDate, Date maxDate);



}
