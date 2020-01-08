package by.jwdc.finences.bean;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Operation implements Serializable {

    private GregorianCalendar date;
    private String type;
    private double value;

    public Operation(GregorianCalendar date, String type, double value) {

        this.date = date;
        this.type = type;
        this.value = value;
    }

    public Operation() {
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }



    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (this == obj){
            return true;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }
        Operation operation = (Operation)obj;
        return  date.equals(operation.date) &&
                type.equals(operation.type) &&
                value == operation.value;
    }

    @Override
    public int hashCode(){
        int res = 7;
        int prime = 31;

        res = res * prime + (date == null ? 0 : date.hashCode());
        res = res * prime + (type == null ? 0 : type.hashCode());
        res = res * prime + (int)(value * 100);

        return res;
    }

    @Override
    public String toString() {
        return this.getClass() +
                " date=" + date +
                " type=" + type +
                " value=" + value;
    }
}


