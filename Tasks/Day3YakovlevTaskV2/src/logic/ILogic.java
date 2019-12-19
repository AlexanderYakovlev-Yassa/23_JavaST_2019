package logic;

import enums.Color;
import enums.ItemType;
import logic.service.Logic;

import java.util.ArrayList;

public interface ILogic {

    public static Logic getInstance() {
        return Logic.getInstance();
    }

    public IBasket createBasket();
    public IBasket createBasket(ArrayList<IBasketable> content, int maxContentWeight);

    public boolean addItem(IBasket basket, IBasketable item);

    public IBasketable createItem(ItemType itemType);

    public int countItem(IBasket basket);
    public int countItemByType(IBasket basket, ItemType itemType);
    public int countItemByTypeAndColor(IBasket basket, ItemType itemType, Color color);

    public int weightOfItemsOfType(IBasket basket, ItemType itemType);
}
