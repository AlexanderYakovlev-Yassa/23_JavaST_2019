package logic.bean;

import logic.IBasket;
import logic.IBasketable;

import java.util.ArrayList;

public class Basket implements IBasket{

    private ArrayList<IBasketable> content;
    private int maxItem;

    public Basket(ArrayList<IBasketable> content, int maxItem) {
        this.content = content;
        this.maxItem = maxItem;
    }

    public Basket() {
        this.content = new ArrayList<IBasketable>();
        this.maxItem = 10;
    }

    public ArrayList<IBasketable> getContent() {
        return content;
    }

    public IBasketable getContent(int index) {
        return content.get(index);
    }

    public void setContent(int index, IBasketable contentItem) {
        this.content.set(index, contentItem);
    }

    public void setContent(ArrayList<IBasketable> content) {
        this.content = content;
    }

    public int getMaxItem() {
        return maxItem;
    }

    public void setMaxItem(int maxItem) {
        this.maxItem = maxItem;
    }

    public boolean addItem(IBasketable item){

        if (!hasSuchItem(item)) {
            content.add(item);
            return true;
        } else {
            return false;
        }
    }

    private boolean hasSuchItem(IBasketable item){

        for (IBasketable b : content){
            if (b == item){
                return true;
            }
        }

        return false;
    }



}
