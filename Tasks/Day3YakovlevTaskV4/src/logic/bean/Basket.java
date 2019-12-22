package logic.bean;

import logic.IBasket;
import logic.IBasketable;
import exceptions.BasketException;

import java.util.ArrayList;

public class Basket implements IBasket {

    private ArrayList<IBasketable> content;
    private final int maxItemCapacity;

    public Basket(ArrayList<IBasketable> content, int maxItemCapacity) {
        this.content = content;
        this.maxItemCapacity = maxItemCapacity;
    }

    public Basket() {
        this.content = new ArrayList<IBasketable>();
        this.maxItemCapacity = 10;
    }

    public ArrayList<IBasketable> getContent() {
        return content;
    }

    @Override
    public void clearBasket() {
        content.clear();
    }

    @Override
    public int getMaxItemCapacity() {
        return maxItemCapacity;
    }

    public void addItem(IBasketable item) throws BasketException {

        if (content.size() >= maxItemCapacity){
            throw new BasketException("Can't add item. Basket is full");
        }
        if (item == null) {
            throw new BasketException("Item doesn't exist");
        }
        if (item.isInBasket()) {
            throw new BasketException("Item Is Already In Some Basket");
        }

        content.add(item);
        item.markInBasket();
    }

    @Override
    public void removeItem(IBasketable item) throws BasketException {
        if (item == null) {
            throw new BasketException("Item doesn't exist");
        }
        if (!isItemInThisBasket(item)){
            throw new BasketException("This basket doesn't have such item");
        }

        content.remove(item);
    }

    private boolean isItemInThisBasket(IBasketable item){
        if (item == null){
            return false;
        }

        for (IBasketable i: content){
            if(item.equals(i)){
                return true;
            }
        }
        return false;
    }
}
