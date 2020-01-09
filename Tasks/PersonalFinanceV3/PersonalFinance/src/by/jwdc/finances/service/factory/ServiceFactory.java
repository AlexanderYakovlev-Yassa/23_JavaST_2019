package by.jwdc.finances.service.factory;

import by.jwdc.finances.service.IOperationService;
import by.jwdc.finances.service.impl.OperationService;

public class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    private final IOperationService operationService = new OperationService();

    private ServiceFactory(){}

    public static ServiceFactory getInstance() {
        return instance;
    }

    public IOperationService getOperationService() {
        return operationService;
    }
}
