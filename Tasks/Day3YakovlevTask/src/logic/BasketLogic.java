package logic;

import logic.enumerator.Color;
import logic.enumerator.ItemKind;

public interface BasketLogic {

    public int countItem(Basket basket);
    public int countItemByType(Basket basket, ItemKind itemKind);
    public int countItemByTypeAndColor(Basket basket, ItemKind itemKind, Color color);
}
