package logic;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Basketable> content;
    private int maxContentWeight;

    public Basket(ArrayList<Basketable> content, int maxContentWeight) {
        this.content = content;
        this.maxContentWeight = maxContentWeight;
    }

    public Basket() {
        this.content = new ArrayList<Basketable>();
        this.maxContentWeight = 1000;
    }

    public ArrayList<Basketable> getContent() {
        return content;
    }

    public Basketable getContent(int index) {
        return content.get(index);
    }

    public void setContent(int index, Basketable contentItem) {
        this.content.set(index, contentItem);
    }

    public int getMaxContentWeight() {
        return maxContentWeight;
    }

    public void setMaxContentWeight(int maxContentWeight) {
        this.maxContentWeight = maxContentWeight;
    }

    public boolean addItem(Basketable item){

        //content.add(item);

        if (!hasSuchItem(item)) {
            content.add(item);
            return true;
        } else {
            return false;
        }

        //return  true;
    }

    private boolean hasSuchItem(Basketable item){

        for (Basketable b : content){
            if (b == item){
                return true;
            }
        }

        return false;
    }
}
