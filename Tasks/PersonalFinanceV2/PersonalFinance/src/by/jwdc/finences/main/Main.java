package by.jwdc.finences.main;

import by.jwdc.finences.service.IOperationService;
import oracle.jrockit.jfr.openmbean.PresetFileType;

public class Main {

    public static void main(String[] args) {

        ServiceProvider serviceProvider = ServiceProvider.getInstance();

        IOperationService operationService = serviceProvider.getOperationService();

        System.out.println("Insert login");
        String login;

        String password;

        //loginUser(login, password);
    }

    boolean loginUser(String login, String password){

        ServiceProvider serviceProvider = ServiceProvider.getInstance();

        boolean res = false;
        return res;
    }
}
