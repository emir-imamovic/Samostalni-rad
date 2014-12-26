package Cestitka;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Geometry {
	private int width;
	private int height;

	public Rectangle(int positionX, int positionY, Color color, int width,
			int height) {
		super(positionX, positionY, color);
		this.width = width;
		this.height = height;
	}

	public void draw(Graphics g, int frame) {
		move(frame);
		g.getColor();
		g.fillRect(getPositionX(), getPositionY(), width, height);
	}

	public void move(int frame) {
		return;
	}

}
