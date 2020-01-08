package by.jwdc.finences.bean.factory;

import by.jwdc.finences.bean.Operation;
import by.jwdc.finences.bean.OperationType;
import by.jwdc.finences.bean.exception.BeanFactoryException;

import java.util.GregorianCalendar;

public class BeanFactory {

    private static final BeanFactory instance = new BeanFactory();

    private BeanFactory() {
    }

    public static BeanFactory getInstance() {
        return instance;
    }

    public Operation createOperation(String record) throws BeanFactoryException {

        Operation operation = null;

        if (record == null) {
            return null;
        }

        String[] fields = record.split(" ");

        GregorianCalendar date = toDate(fields[0]);
        if (date == null){
            throw new BeanFactoryException("Wrong operation date");
        }

        //String type = fields[1];
        OperationType type = toType(fields[1]);

        double value = 0;
        try {
            value = Double.parseDouble(fields[2]);
        } catch (NullPointerException | NumberFormatException e){
            throw new BeanFactoryException("Wrong operation value", e);
        }

        return operation;
    }

    //********************************************************************** VALIDATOR *********************************

    private static OperationType toType(String string){
        OperationType type = null;

        return type;
    }

    private static GregorianCalendar toDate(String string) {

        GregorianCalendar res = null;

        if (string == null) {
            return null;
        }
        if (string.length() != 12) {
            return null;
        }
        if (!isAllSymbolDigit(string)) {
            return null;
        }

        int year = Integer.parseInt(string.substring(0, 4));
        int month = Integer.parseInt(string.substring(4, 6));
        int day = Integer.parseInt(string.substring(6, 8));
        int hour = Integer.parseInt(string.substring(8, 10));
        int min = Integer.parseInt(string.substring(10));

        res = new GregorianCalendar(year, month, day, hour, min);

        return res;
    }

    private static boolean isAllSymbolDigit(String string) {
        char[] chars = string.toCharArray();
        int i = 0;
        boolean res = true;
        while (i < chars.length) {

            if (!(Character.isDigit(chars[i]))) {
                res = false;
                break;
            }

            i++;
        }

        return res;
    }
}
