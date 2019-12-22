package logic;

import enums.Color;
import enums.ItemType;

public interface IBasketable {

    ItemType getItemType();
    Color getItemColor();
    boolean isInBasket();
    void markInBasket();
    void markOutBasket();
}
