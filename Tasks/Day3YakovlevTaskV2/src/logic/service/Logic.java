package logic.service;

import enums.Color;
import enums.ItemType;
import logic.*;
import logic.bean.Ball;
import logic.bean.Basket;

import java.util.ArrayList;

public class Logic implements ILogic {

    private static final Logic instance = new Logic();

    private Logic(){
    }

    public static Logic getInstance() {
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
    public boolean addItem(IBasket basket, IBasketable item) {

        if (basket != null && item != null){
            basket.addItem(item);
            return true;
        }

        return false;
    }

    @Override
    public IBasketable createItem(ItemType itemType) {

        switch (itemType){
            case BALL:{
                return new Ball();
            }
        }

        return null;
    }

    @Override
    public int countItem(IBasket basket) {
        return basket.getContent().size();
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
    public int weightOfItemsOfType(IBasket basket, ItemType itemType) {

        int weight = 0;

        for(IBasketable i:basket.getContent()){

            if (i.getItemType() == itemType){

                weight += i.getWeight();
            }
        }

        return weight;
    }
}
