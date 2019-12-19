package main;

import logic.*;
import logic.IBasketable;
import enums.Color;
import enums.ItemType;

public class main {

    public static void main(String[] args) {

        ILogic logic = ILogic.getInstance();

        IBasket basket = logic.createBasket();

        //needs user interface

        IBasketable ball1 = logic.createItem(ItemType.BALL);
        ball1.setColor(Color.WHITE);
        ball1.setWeight(200);
        logic.addItem(basket, ball1);

        IBasketable ball2 = logic.createItem(ItemType.BALL);
        ball2.setColor(Color.GREEN);
        ball2.setWeight(300);
        logic.addItem(basket, ball2);

        IBasketable ball3 = logic.createItem(ItemType.BALL);
        ball3.setColor(Color.ORANGE);
        ball3.setWeight(500);
        logic.addItem(basket, ball3);

        IBasketable ball4 = logic.createItem(ItemType.BALL);
        ball4.setColor(Color.BLUE);
        ball4.setWeight(150);
        logic.addItem(basket, ball4);

        IBasketable ball5 = logic.createItem(ItemType.BALL);
        ball5.setColor(Color.WHITE);
        logic.addItem(basket, ball5);

        IBasketable ball6 = logic.createItem(ItemType.BALL);
        ball6.setColor(Color.BLUE);
        ball5.setWeight(230);
        logic.addItem(basket, ball6);

        System.out.printf("\nThere are %d balls in the basket", logic.countItemByType(basket, ItemType.BALL));
        System.out.printf("\nThere are %d blue balls in the basket",
                logic.countItemByTypeAndColor(basket, ItemType.BALL, Color.BLUE));
        System.out.println("\nAll the balls have weight equal " + logic.weightOfItemsOfType(basket, ItemType.BALL));
        System.out.println("");
    }
}
