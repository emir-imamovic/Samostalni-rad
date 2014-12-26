package Cestitka;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Geometry {
	private int width;

	public Circle(int positionX, int positionY, int width, Color color) {
		super(positionX, positionY, color);
		this.width = width;
	}

	public void draw(Graphics g, int frame) {
		move(frame);
		g.setColor(super.getColor());
		g.fillOval(getPositionX(), getPositionY(), width, width);
	}

	public void move(int frame) {
		return;
	}

}
