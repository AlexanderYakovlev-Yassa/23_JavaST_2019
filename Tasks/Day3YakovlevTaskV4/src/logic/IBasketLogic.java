package logic;

import enums.Color;
import enums.ItemType;
import exceptions.BasketLogicException;
import logic.service.BasketLogic;

import java.util.ArrayList;

public interface IBasketLogic {

    static BasketLogic getInstance() {
        return BasketLogic.getInstance();
    }

    IBasket createBasket();
    IBasket createBasket(ArrayList<IBasketable> content, int maxContentWeight);

    int countItemByType(IBasket basket, ItemType itemType);
    int countItemByTypeAndColor(IBasket basket, ItemType itemType, Color color);

    IBasketable takeItemFromBunch(ArrayList<IBasketable> bunch, ItemType type, Color color) throws BasketLogicException;
}
