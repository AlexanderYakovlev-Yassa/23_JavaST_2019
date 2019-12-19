package main;

import logic.*;
import logic.enumerator.Color;
import logic.enumerator.ItemKind;

public class main {

    public static void main(String[] args) {

        Basket basket = new Basket();

        Basketable ball1 = new Ball(Color.BLACK, 100);
        Basketable ball2 = new Ball(Color.GREEN, 100);
        Basketable ball3 = new Ball(Color.BLUE, 100);
        Basketable ball4 = new Ball(Color.ORANGE, 100);
        Basketable ball5 = new Ball(Color.BLUE, 100);
        Basketable ball6 = new Ball(Color.BLUE, 200);

        basket.addItem(ball1);
        basket.addItem(ball2);
        basket.addItem(ball3);
        basket.addItem(ball4);
        basket.addItem(ball5);
        basket.addItem(ball6);
        basket.addItem(ball6);

        BasketLogic logic = new BasketLogic1();

        System.out.printf("\nThere are %d balls in the basket", logic.countItemByType(basket, ItemKind.BALL));
        System.out.printf("\nThere are %d blue balls in the basket",
                logic.countItemByTypeAndColor(basket, ItemKind.BALL, Color.BLUE));

    }
}
