package logic.bean;

import enums.Color;
import logic.IBasketable;
import logic.IColorable;
import enums.ItemType;

import java.util.Objects;

public class Ball implements IBasketable, IColorable {

	private final Color color;
	private final int weight;
	private boolean InBasket;
	
	public Ball(int weight, Color color) {

		this.weight = weight;
		this.color = color;
	}
	
	public Ball() {
		
		this.color = Color.WHITE;
		this.weight = 100;
	}


	@Override
	public Color getColor() {
		return color;
	}

	/*public void setColor(Color color) {
		this.color = color;
	}*/

	int getWeight() {
		return weight;
	}

	/*void setWeight(int weight) {
		this.weight = weight;
	}*/

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Ball)) return false;
		Ball ball = (Ball) o;
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
		return ItemType.BALL;
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
