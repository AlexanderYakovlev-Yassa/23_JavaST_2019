package logic.bean;

import enums.Color;
import enums.ItemType;
import logic.IBasketable;
import logic.IColorable;

import java.util.Objects;

public class SomeNoColorItem implements IBasketable {

	private final int weight;
	private boolean InBasket;

	public SomeNoColorItem(int weight) {

		this.weight = weight;
	}

	int getWeight() {
		return weight;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof SomeNoColorItem)) return false;
		SomeNoColorItem ball = (SomeNoColorItem) o;
		return getWeight() == ball.getWeight();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getWeight(), isInBasket());
	}

	@Override
	public String toString() {
		return this.getClass() +
				", weight=" + weight +
				'}';
	}

	@Override
	public ItemType getItemType() {
		return ItemType.SOME_NO_COLOR_ITEM;
	}

	@Override
	public Color getItemColor() {
		return null;
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
