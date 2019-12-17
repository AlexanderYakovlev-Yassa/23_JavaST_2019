package logic;

public class BasketLogic {

    public static int numberItemKind(Basket basket, ItemKind itemKind){

        int num = 0;

        for(Basketable b : basket.getContent()){

            if (itemKind == b.getItemKind()){
                num++;
            }
        }

        return num;
    }
}
