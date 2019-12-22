package logic.bean;

import enums.Color;
import enums.ItemType;
import logic.IBasketable;
import logic.IColorable;

import java.util.Objects;

public class SomeColoredItem implements IBasketable, IColorable {

	private final Color color;
	private final int weight;
	private boolean InBasket;

	public SomeColoredItem(int weight, Color color) {

		this.weight = weight;
		this.color = color;
	}

	public SomeColoredItem() {
		
		this.color = Color.WHITE;
		this.weight = 100;
	}


	@Override
	public Color getColor() {
		return color;
	}

	int getWeight() {
		return weight;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof SomeColoredItem)) return false;
		SomeColoredItem ball = (SomeColoredItem) o;
		return getWeight() == ball.getWeight() &&
				getColor() == ball.getColor();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getColor(), getWeight());
	}

	@Override
	public String toString() {
		return this.getClass() +
				"color=" + color +
				", weight=" + weight +
				'}';
	}

	@Override
	public ItemType getItemType() {
		return ItemType.SOME_COLORED_ITEM;
	}

	@Override
	public Color getItemColor() {
		return color;
	}

	@Override
	public boolean isInBasket() {
		return InBasket;
	}

	@Override
	public void markInBasket() {
		InBasket = true;
	}

	@Override
	public void markOutBasket() {
		InBasket = false;
	}
}
