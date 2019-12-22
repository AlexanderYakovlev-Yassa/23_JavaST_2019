package logic.service;

import enums.Color;
import enums.ItemType;
import exceptions.FabricLogicException;
import logic.IBasketable;
import logic.IFabricLogic;
import logic.bean.Ball;
import logic.bean.SomeColoredItem;
import logic.bean.SomeNoColorItem;
import logic.validator.Validator;

public class FabricLogic implements IFabricLogic {
    private static final FabricLogic instance = new FabricLogic();

    private FabricLogic(){
    }

    public static FabricLogic getInstance() {
        return instance;
    }

    @Override
    public IBasketable createItem(ItemType type, int weight, Color color) throws FabricLogicException {
        if (type == null){
            throw new FabricLogicException("No type for create an item");
        }

        if (weight <= 0){
            throw new FabricLogicException("An item must have weight");
        }

        switch (type){
            case BALL:{
                if (color == null){
                    throw  new FabricLogicException("Such an item needs to be colored");
                }
                return new Ball(weight, color);
            }
            case SOME_COLORED_ITEM:{
                if (color == null){
                    throw  new FabricLogicException("Such an item needs to be colored");
                }
                return new SomeColoredItem(weight, color);
            }
            case SOME_NO_COLOR_ITEM:{
                return new SomeNoColorItem(weight);
            }
            default:{
                throw new FabricLogicException("Can't create an item of such type");
            }
        }
    }
}
