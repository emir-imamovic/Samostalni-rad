package Cestitka;

import java.awt.Color;
import java.awt.Graphics;

public class Arch extends Geometry {
	private int width;
	private int height;
	private int startAngle;
	private int arcAngle;

	public Arch(int positionX, int positionY, Color color, int width,
			int height, int startAngle, int arcAngle) {
		super(positionX, positionY, color);
		this.arcAngle = arcAngle;
		this.startAngle = startAngle;
		this.width = width;
		this.height = height;
	}

	public void draw(Graphics g, int frame) {
		move(frame);
		g.getColor();
		g.drawArc(getPositionX(), getPositionY(), width, height, startAngle,
				arcAngle);
	}

	public void move(int frame) {
		return;
	}

}
