package logic;

import java.util.ArrayList;

public interface IBasketLogic {

    public Basket createBasket();
    public Basket createBasket(ArrayList<IBasketable> content, int maxContentWeight);

    public boolean addItem(Basket basket, IBasketable item);

    public IBasketable createItem(ItemType itemType);

    //public ItemType getItemType(IBasketable item);

    public boolean setItemColor(IBasketable item, Color color);
    public Color getItemColor(IBasketable item);

    public int countItem(Basket basket);
    public int countItemByType(Basket basket, ItemType itemType);
    public int countItemByTypeAndColor(Basket basket, ItemType itemType, Color color);
}
