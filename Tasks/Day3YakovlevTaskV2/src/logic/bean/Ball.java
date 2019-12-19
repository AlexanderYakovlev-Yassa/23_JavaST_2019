package logic.bean;

import enums.Color;
import logic.IBasketable;
import logic.IColorable;
import enums.ItemType;

import java.util.Objects;

public class Ball implements IBasketable, IColorable {

	private Color color;
	private int weight;
	
	public Ball(Color color, int weight) {
		
		this.color = color;
		this.weight = weight;
	}
	
	public Ball() {
		
		this.color = Color.WHITE;
		this.weight = 100;
	}

	@Override
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {

		if (this instanceof IColorable) {
			this.color = color;
		}
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

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
		return "Ball{" +
				"color=" + color +
				", weight=" + weight +
				'}';
	}

	@Override
	public ItemType getItemType() {
		return ItemType.BALL;
	}
}
