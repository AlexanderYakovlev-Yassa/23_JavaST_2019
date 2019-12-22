package main;

import exceptions.BasketLogicException;
import exceptions.FabricLogicException;
import logic.*;
import logic.IBasketable;
import enums.Color;
import enums.ItemType;
import exceptions.BasketException;

import java.util.ArrayList;
import java.util.Random;

public class main {

    public static void main(String[] args) {

        IBasketLogic basketLogic = IBasketLogic.getInstance();

        IBasket basket = basketLogic.createBasket();

        ArrayList<IBasketable> store = bunchOfRandomItem(100);

        IBasketable ball1 = takeItemFromBunch(store, ItemType.BALL, Color.WHITE);
        IBasketable ball2 = takeItemFromBunch(store, ItemType.BALL, Color.BLACK);
        IBasketable ball3 = takeItemFromBunch(store, ItemType.BALL, Color.BLUE);
        IBasketable ball4 = takeItemFromBunch(store, ItemType.BALL, Color.ORANGE);
        IBasketable ball5 = takeItemFromBunch(store, ItemType.BALL, Color.BLACK);
        IBasketable ball6 = takeItemFromBunch(store, ItemType.BALL, Color.BLUE);
        IBasketable ball7 = takeItemFromBunch(store, ItemType.BALL, Color.BLUE);




        addIdemToBasket(basket, ball1);
        addIdemToBasket(basket, ball2);
        addIdemToBasket(basket, ball3);
        addIdemToBasket(basket, ball4);
        addIdemToBasket(basket, ball5);
        addIdemToBasket(basket, ball6);
        addIdemToBasket(basket, ball7);
        addIdemToBasket(basket, ball6);
        addIdemToBasket(basket, null);

        System.out.printf("\nThere are %d balls in the basket", basketLogic.countItemByType(basket, ItemType.BALL));
        System.out.printf("\nThere are %d blue balls in the basket\n",
                basketLogic.countItemByTypeAndColor(basket, ItemType.BALL, Color.BLUE));

        removeItemFromBasket(basket, ball5);
        removeItemFromBasket(basket, ball5);

        showAllItem(basket);


    }

    public static void showAllItem(IBasket basket) {
        String color;
        Color itemColor;
        System.out.println("***");
        for (IBasketable i : basket.getContent()) {
            color = ((itemColor = itemColor(i)) == null) ? "no color" : itemColor.name().toLowerCase();
            System.out.println(color + " " + i.getItemType().name().toLowerCase());
        }
        System.out.println("---");
    }

    public static Color itemColor(IBasketable item) {

        if (item instanceof IColorable) {
            return ((IColorable) ((IColorable) item)).getColor();
        }

        return null;
    }

    public static void addIdemToBasket(IBasket basket, IBasketable item) {
        try {
            basket.addItem(item);
        } catch (BasketException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void removeItemFromBasket(IBasket basket, IBasketable item) {
        try {
            basket.removeItem(item);
        } catch (BasketException e) {
            System.out.println(e.getMessage());
        }
    }

    public static IBasketable createItem(ItemType type, int weight, Color color) {

        IFabricLogic fabricLogic = IFabricLogic.getInstance();

        try {
            return fabricLogic.createItem(type, weight, color);
        } catch (FabricLogicException e) {
            System.out.println(e);
            return null;
        }
    }

    private static int randomWeight(int minWeight, int maxWeight) {
        return (int) (Math.random() * (maxWeight - minWeight)) + minWeight;
    }

    private static ItemType randomType(){

        int numberOfTypes =ItemType.values().length;
        Random r = new Random();
        int intRandomType = r.nextInt(numberOfTypes);
        ItemType type = null;
        for (ItemType t:ItemType.values()){
            if (t.ordinal() == intRandomType){
                type = t;
            }
        }
        return type;
    }

    private static Color randomColor(){

        int numberOfTypes =Color.values().length;
        Random r = new Random();
        int intRandomType = r.nextInt(numberOfTypes);
        Color color = null;
        for (Color t:Color.values()){
            if (t.ordinal() == intRandomType){
                color = t;
            }
        }
        return color;
    }

    private static ArrayList<IBasketable> bunchOfRandomItem(int numberOfItem){

        ItemType type = null;
        Color color = null;
        int weight = 0;

        ArrayList<IBasketable> bunch = new ArrayList<IBasketable>();
        for (int i = 0; i < numberOfItem; i++) {
                type = randomType();
                color = randomColor();
                weight = randomWeight(10,500);

                bunch.add(createItem(type, weight, color));
        }
        return bunch;
    }

    private static IBasketable takeItemFromBunch(ArrayList<IBasketable> bunch, ItemType type, Color color){
        IBasketLogic basketLogic = IBasketLogic.getInstance();

        try {
            return basketLogic.takeItemFromBunch(bunch, type, color);
        } catch (BasketLogicException e) {
            System.out.println(e);
        }
        return null;
    }

}

