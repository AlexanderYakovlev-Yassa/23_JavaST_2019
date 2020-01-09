package by.jwdc.finances.dao.impl;

import by.jwdc.finances.bean.FinanceOperation;
import by.jwdc.finances.bean.exception.BeanFactoryException;
import by.jwdc.finances.bean.factory.BeanFactory;
import by.jwdc.finances.dao.IFinanceOperationDAO;
import by.jwdc.finances.dao.exception.DaoUtilException;
import by.jwdc.finances.dao.exception.FinanceOperationDAOException;
import by.jwdc.finances.dao.factory.DAOFactory;
import by.jwdc.finances.dao.util.FileUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

public class FileFinanceOperationDAO implements IFinanceOperationDAO {

    private static final File financeMovementFile = new File("src\\by\\jwdc\\finances\\data\\file\\Finance_movement.dat");

    @Override
    public boolean addFinanceOperation(FinanceOperation operation) throws FinanceOperationDAOException {

        if (operation == null){
            throw new FinanceOperationDAOException("Finance operation is null");
        }

        if (hasFinanceOperationInBase(operation)){
            return false;
        }

        String record = financeOperationToString(operation);

        try {
            FileUtil.addRecordToFile(financeMovementFile, record);
        } catch (DaoUtilException e) {
            throw new FinanceOperationDAOException("Data access error", e);
        }

        return true;
    }

    @Override
    public boolean hasFinanceOperationInBase(FinanceOperation operation) throws FinanceOperationDAOException{

        ArrayList<FinanceOperation> allFinanceOperation  = new ArrayList<FinanceOperation>();

        if (operation == null){
            throw new FinanceOperationDAOException("Finance operation is null");
        }

        try {
            allFinanceOperation = getAllFinanceOperations();
        } catch (FinanceOperationDAOException e) {
            throw e;
        }

        for (FinanceOperation fo : allFinanceOperation){

            if (operation.equals(fo)){
                return true;
            }
        }

        return false;
    }

    @Override
    public void rewriteAllFinanceOperation(ArrayList<FinanceOperation> allOperations)
            throws FinanceOperationDAOException {

        if (allOperations == null){
            throw new FinanceOperationDAOException("Finance operation list is null");
        }

        ArrayList<String> recordList = new ArrayList<String>();

        for (FinanceOperation f : allOperations){
            recordList.add(financeOperationToString(f));
        }

        try {
            FileUtil.rewriteFile(financeMovementFile, recordList);
        } catch (DaoUtilException e) {
            throw new FinanceOperationDAOException("Data access error", e);
        }
    }

    @Override
    public ArrayList<FinanceOperation> getAllFinanceOperations() throws FinanceOperationDAOException {

        BeanFactory factory = BeanFactory.getInstance();

        ArrayList<String> recordsList;

        try {
            recordsList = FileUtil.readFile(financeMovementFile);
        } catch (DaoUtilException e) {
            throw new FinanceOperationDAOException("Data source error", e);
        }

        ArrayList<FinanceOperation> financeOperations = new ArrayList<FinanceOperation>();

        //turn all records to "FinanceOperation" objects
        FinanceOperation tempFinanceOperation = null;
        for (String s : recordsList){
            try {
                tempFinanceOperation = factory.createOperation(s);
            } catch (BeanFactoryException e){
                throw new FinanceOperationDAOException("Data conversion error", e);
            }

            financeOperations.add(tempFinanceOperation);
        }

        return financeOperations;
    }

    private static String financeOperationToString(FinanceOperation financeOperation){

        StringBuilder sb = new StringBuilder();
        String tmp;
        sb.append(financeOperation.getDate().get(Calendar.YEAR));
        tmp = String.format("%02d", financeOperation.getDate().get(Calendar.MONTH));
        sb.append(tmp);
        tmp = String.format("%02d", financeOperation.getDate().get(Calendar.DAY_OF_MONTH));
        sb.append(tmp);
        tmp = String.format("%02d", financeOperation.getDate().get(Calendar.HOUR_OF_DAY));
        sb.append(tmp);
        tmp = String.format("%02d", financeOperation.getDate().get(Calendar.MINUTE));
        sb.append(tmp);
        sb.append(" ");

        sb.append(financeOperation.getType().getName());
        sb.append(" ");

        tmp = financeOperation.getType().isInComeOperation() ? "income" : "expenses";
        sb.append(tmp);
        sb.append(" ");

        tmp = String.format("%.2f", financeOperation.getValue());
        sb.append(tmp);

        return sb.toString();
    }

    //*****************************************************************************************************

    public static void main(String[] args) {

        FinanceOperation fo = null;
        try {
            fo = BeanFactory.getInstance().createOperation("202011122100 france expenses 200");
        } catch (BeanFactoryException e) {
            e.printStackTrace();
        }

        String s = financeOperationToString(fo);
        System.out.println("202011122100 france expenses 200");
        System.out.println(s);

        DAOFactory daoFactory = DAOFactory.getInstance();
        IFinanceOperationDAO financeOperationDAO = daoFactory.getOperationDAO();

        try {
            financeOperationDAO.addFinanceOperation(fo);
        } catch (FinanceOperationDAOException e) {
            e.printStackTrace();
        }
    }
}
