package Cestitka;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Geometry {
	private int positionX2;
	private int positionY2;

	public Line(int positionX, int positionY, int positionX2, int positionY2,
			Color color) {
		super(positionX, positionY, color);
		this.positionX2 = positionX2;
		this.positionY2 = positionY2;
	}

	public void draw(Graphics g, int frame) {
		move(frame);
		g.getColor();
		g.drawLine(getPositionX(), getPositionY(), positionX2, positionY2);
	}

	public void move(int frame) {
		positionX2 = (int) (positionX2 + Math.sin(frame / 5) * 6);
		positionY2 = (int) (positionY2 + Math.sin(frame / 5) * 6);
	}

}
