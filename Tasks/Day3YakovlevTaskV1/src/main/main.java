package main;

import logic.*;
import logic.Basket;
import logic.IBasketable;
import logic.Color;
import logic.ItemType;

public class main {

    public static void main(String[] args) {

        IBasketLogic logic = new Logic();

        Basket basket = logic.createBasket();

        IBasketable ball1 = logic.createItem(ItemType.BALL);
        logic.setItemColor(ball1, Color.BLACK);
        IBasketable ball2 = logic.createItem(ItemType.BALL);
        logic.setItemColor(ball2, Color.GREEN);
        IBasketable ball3 = logic.createItem(ItemType.BALL);
        logic.setItemColor(ball3, Color.ORANGE);;
        IBasketable ball4 = logic.createItem(ItemType.BALL);
        logic.setItemColor(ball4, Color.BLUE);
        IBasketable ball5 = logic.createItem(ItemType.BALL);
        logic.setItemColor(ball5, Color.WHITE);
        IBasketable ball6 = logic.createItem(ItemType.BALL);
        logic.setItemColor(ball6, Color.BLUE);

        logic.addItem(basket, ball1);
        logic.addItem(basket, ball2);
        logic.addItem(basket, ball3);
        logic.addItem(basket, ball4);
        logic.addItem(basket, ball5);
        logic.addItem(basket, ball6);



        System.out.printf("\nThere are %d balls in the basket", logic.countItemByType(basket, ItemType.BALL));
        System.out.printf("\nThere are %d blue balls in the basket",
                logic.countItemByTypeAndColor(basket, ItemType.BALL, Color.BLUE));

    }
}
