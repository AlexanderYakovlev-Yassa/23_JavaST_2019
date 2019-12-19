package logic;

import logic.bean.Basket;

import java.util.ArrayList;

public interface IBasket {

    public boolean addItem(IBasketable item);

    public ArrayList<IBasketable> getContent();

}
