package by.jwdc.finences.dao.impl;

import by.jwdc.finences.bean.Operation;
import by.jwdc.finences.dao.IOperationDAO;
import by.jwdc.finences.dao.exception.DaoUtilException;
import by.jwdc.finences.dao.exception.OperationDAOException;
import by.jwdc.finences.dao.util.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class FileOperationDAO implements IOperationDAO {

    private static final File financeMovementFile = new File("src\\by\\jwdc\\finences\\data\\file\\Finance_movement.dat");
    private static final File operationTypesFile = new File("src\\by\\jwdc\\finences\\data\\file\\Operation_types.dat");


    @Override
    public ArrayList<Operation> getAllOperations() throws OperationDAOException {

        ArrayList<String> recordsList;

        try {
            recordsList = FileUtil.readFile(financeMovementFile);
        } catch (DaoUtilException e) {
            throw new OperationDAOException("Data source error", e);
        }

        //turn all records to "Operation" objects

        printList(recordsList);//*************************************************

        return null;
    }

//**************************************************************************** TEST ************************************

    public static void main(String[] args) {

        FileOperationDAO cl = new FileOperationDAO();

        try {
            cl.getAllOperations();
        } catch (OperationDAOException e) {
            System.out.println("error " + e);
        }

    }

    private void printList(ArrayList<String> list){
        for (String s : list){
            System.out.println(s);
        }
    }






}
