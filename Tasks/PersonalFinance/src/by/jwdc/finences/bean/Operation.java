package by.jwdc.finences.bean;

import java.io.Serializable;
import java.util.Date;

public class Operation implements Serializable {
    private User user;
    private Date date;
    private OperationType type;
    private double value;

    public Operation(User user, Date date, OperationType type, double value) {
        this.user = user;
        this.date = date;
        this.type = type;
        this.value = value;
    }

    public Operation() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OperationType getType() {
        return type;
    }

    public void setType(OperationType type) {
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
        return user.equals(operation.user) &&
                date.equals(operation.date) &&
                type == operation.type &&
                value == operation.value;
    }

    @Override
    public int hashCode(){
        int res = 7;
        int prime = 31;

        res = res * prime + user.hashCode();
        res = res * prime + date.hashCode();
        res = res * prime + type.hashCode();
        res = res * prime + (int)value;

        return res;
    }

    @Override
    public String toString() {
        return this.getClass() +
                "user=" + user +
                " date=" + date +
                " type=" + type +
                " value=" + value;
    }
}


