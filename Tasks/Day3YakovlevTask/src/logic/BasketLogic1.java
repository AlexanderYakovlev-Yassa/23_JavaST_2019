package logic;

import logic.enumerator.Color;
import logic.enumerator.ItemKind;

import java.util.ArrayList;

public class BasketLogic1 implements BasketLogic{


    @Override
    public int countItem(Basket basket) {
        return basket.getContent().size();
    }

    @Override
    public int countItemByType(Basket basket, ItemKind itemKind) {

        int count = 0;

        for(Basketable i:basket.getContent()){

            if (i.getItemKind() == itemKind){
                count++;
            }
        }

        return count;

    }

    @Override
    public int countItemByTypeAndColor(Basket basket, ItemKind itemKind, Color color) {

        int count = 0;

        for(Basketable i:basket.getContent()){

            if (i.getItemKind() == itemKind){

                if(i instanceof Colorable){

                    if(((Colorable) i).getColor() == color){

                        count++;
                    }
                }
            }
        }

        return count;
    }
}
