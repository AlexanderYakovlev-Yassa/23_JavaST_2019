package by.jwdc.finences.bean;

import java.io.Serializable;

public class OperationType implements Serializable {

    private int index;
    private String name;

    public OperationType(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public OperationType() {
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (this == obj) {
            return true;
        }
        if(OperationType.class != obj.getClass()){
            return false;
        }
        OperationType operationType = (OperationType)obj;
        return this.index == operationType.index &&
                this.name.equals(operationType.name);
    }

    @Override
    public int hashCode(){
        int res = 7;
        int prime = 31;

        res = res * prime + this.index;
        res = res * prime + (this.name == null ? 0 : this.name.hashCode());

        return res;
    }

    @Override
    public String toString() {
        return this.getClass() + " index=" + index + ", name=" + name;
    }
}
