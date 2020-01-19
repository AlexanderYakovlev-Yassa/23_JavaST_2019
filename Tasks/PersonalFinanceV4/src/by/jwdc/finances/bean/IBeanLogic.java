package by.jwdc.finances.bean;

import by.jwdc.finances.bean.bean.FinanceOperation;
import by.jwdc.finances.bean.bean.OperationType;
import by.jwdc.finances.bean.exception.BeanException;
import by.jwdc.finances.bean.exception.BeanInitialisationException;
import by.jwdc.finances.bean.exception.BeanNullParametersException;
import by.jwdc.finances.bean.exception.BeanWrongParameterException;

public interface IBeanLogic {

    OperationType stringToOperationType(String string) throws BeanNullParametersException, BeanWrongParameterException;

    String OperationTypeToString(OperationType type);

    FinanceOperation stringToFinanceOperation(String string) throws BeanNullParametersException, BeanWrongParameterException, BeanException, BeanInitialisationException;

    String FinanceOperationToString(FinanceOperation financeOperation);

    void addToAllOperationType(OperationType operationType) throws BeanInitialisationException;
    boolean deleteFromAllOperationType(OperationType operationType);

}
