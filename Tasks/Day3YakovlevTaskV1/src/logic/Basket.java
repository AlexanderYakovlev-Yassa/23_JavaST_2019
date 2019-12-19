package logic;

import java.util.ArrayList;

public class Basket {

    private ArrayList<IBasketable> content;
    private int maxContentWeight;

    protected Basket(ArrayList<IBasketable> content, int maxContentWeight) {
        this.content = content;
        this.maxContentWeight = maxContentWeight;
    }

    protected Basket() {
        this.content = new ArrayList<IBasketable>();
        this.maxContentWeight = 1000;
    }

    protected ArrayList<IBasketable> getContent() {
        return content;
    }

    protected IBasketable getContent(int index) {
        return content.get(index);
    }

    protected void setContent(int index, IBasketable contentItem) {
        this.content.set(index, contentItem);
    }

    protected int getMaxContentWeight() {
        return maxContentWeight;
    }

    protected void setMaxContentWeight(int maxContentWeight) {
        this.maxContentWeight = maxContentWeight;
    }

    protected boolean addItem(IBasketable item){

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
