package by.jwdc.finences.service.factory;

import by.jwdc.finences.service.IOperationService;
import by.jwdc.finences.service.impl.OperationService;

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
