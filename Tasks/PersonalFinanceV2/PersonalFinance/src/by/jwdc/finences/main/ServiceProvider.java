package by.jwdc.finences.main;

import by.jwdc.finences.service.IOperationService;
import by.jwdc.finences.service.impl.OperationService;

public class ServiceProvider {

    private final static ServiceProvider instance = new ServiceProvider();

    private IOperationService operationService = new OperationService();

    private ServiceProvider(){}

    public static ServiceProvider getInstance() {
        return instance;
    }

    public IOperationService getOperationService() {
        return operationService;
    }
}
