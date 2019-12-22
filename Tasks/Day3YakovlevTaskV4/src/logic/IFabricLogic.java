package logic;

import enums.Color;
import enums.ItemType;
import exceptions.FabricLogicException;
import logic.IBasketable;

public interface IFabricLogic {

    static IFabricLogic getInstance() {
        return null;
    }

    IBasketable createItem(ItemType type, int weight, Color color) throws FabricLogicException;
}
