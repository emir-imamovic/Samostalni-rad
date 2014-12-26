package Cestitka;

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends Geometry {
	private int width;
	private int height;

	public Oval(int positionX, int positionY, int width, int height, Color color) {
		super(positionX, positionY, color);
		this.width = width;
		this.height = height;
	}

	public void draw(Graphics g, int frame) {
		move(frame);
		g.setColor(super.getColor());
		g.fillOval(getPositionX(), getPositionY(), width, height);
	}

	public void move(int frame) {
		return;
	}

}
