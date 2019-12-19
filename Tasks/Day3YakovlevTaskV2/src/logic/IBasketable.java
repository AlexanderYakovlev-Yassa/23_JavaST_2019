package logic;

import enums.Color;
import enums.ItemType;

public interface IBasketable {

    public ItemType getItemType();

    public void setColor(Color color);
    public Color getColor();

    public void setWeight(int weight);
    public int getWeight();

}
