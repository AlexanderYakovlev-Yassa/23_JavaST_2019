package logic.service;

import enums.Color;
import enums.ItemType;
import exceptions.BasketLogicException;
import logic.*;
import logic.bean.Ball;
import logic.bean.Basket;

import java.util.ArrayList;

public class BasketLogic implements IBasketLogic {

    private static final BasketLogic instance = new BasketLogic();

    private BasketLogic(){
    }

    public static BasketLogic getInstance() {
        return instance;
    }

    @Override
    public IBasket createBasket() {
        return new Basket();
    }

    @Override
    public IBasket createBasket(ArrayList<IBasketable> content, int maxContentWeight) {
        return new Basket(content, maxContentWeight);
    }

    @Override
    public int countItemByType(IBasket basket, ItemType itemType) {

        int count = 0;

        for(IBasketable i:basket.getContent()){

            if (i.getItemType() == itemType){
                count++;
            }
        }

        return count;

    }

    @Override
    public int countItemByTypeAndColor(IBasket basket, ItemType itemType, Color color) {

        int count = 0;

        for(IBasketable i:basket.getContent()){

            if (i.getItemType() == itemType){

                if(i instanceof IColorable){

                    if(((IColorable) i).getColor() == color){

                        count++;
                    }
                }
            }
        }

        return count;
    }

    @Override
    public IBasketable takeItemFromBunch(ArrayList<IBasketable> bunch, ItemType type, Color color) throws BasketLogicException {

        if(type == null){
            throw new BasketLogicException("Can't take no type item");
        }

        for(IBasketable i:bunch){
                if (i.getItemType() == type && i.getItemColor() == color){
                    return i;
            }
        }
        throw new BasketLogicException("Bunch doesn't have an item of such type and color");
    }
}
