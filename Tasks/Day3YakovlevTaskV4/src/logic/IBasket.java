package logic;

import exceptions.BasketException;

import java.util.ArrayList;

public interface IBasket {

    void addItem(IBasketable item) throws BasketException;

    void removeItem(IBasketable item) throws BasketException;

    ArrayList<IBasketable> getContent();

    void clearBasket();

    int getMaxItemCapacity();

}
