package logic;

import java.util.ArrayList;

public class Logic implements IBasketLogic {

    @Override
    public Basket createBasket() {
        return new Basket();
    }

    @Override
    public Basket createBasket(ArrayList<IBasketable> content, int maxContentWeight) {
        return new Basket(content, maxContentWeight);
    }

    @Override
    public boolean addItem(Basket basket, IBasketable item) {

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
    public boolean setItemColor(IBasketable item, Color color) {

        if (item instanceof IColor){
            ((IColor) item).setColor(color);
            return true;
        }

        return false;
    }

    @Override
    public Color getItemColor(IBasketable item) {

        if (item instanceof IColor){
            return ((IColor) item).getColor();
        }

        return null;
    }

    @Override
    public int countItem(Basket basket) {
        return basket.getContent().size();
    }

    @Override
    public int countItemByType(Basket basket, ItemType itemType) {

        int count = 0;

        for(IBasketable i:basket.getContent()){

            if (i.getItemType() == itemType){
                count++;
            }
        }

        return count;

    }

    @Override
    public int countItemByTypeAndColor(Basket basket, ItemType itemType, Color color) {

        int count = 0;

        for(IBasketable i:basket.getContent()){

            if (i.getItemType() == itemType){

                if(i instanceof IColor){

                    if(((IColor) i).getColor() == color){

                        count++;
                    }
                }
            }
        }

        return count;
    }
}
