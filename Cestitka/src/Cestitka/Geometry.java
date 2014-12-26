package Cestitka;

	import java.awt.Color;
	import java.awt.Graphics;
	public class Geometry implements GeometryObject {
	private int positionX;
	private int positionY;
	private Color color;
	public Geometry(int positionX, int positionY, Color color){
	this.positionX = positionX;
	this.positionY = positionY;
	this.color = color;
	}
	public int getPositionX() {
	return positionX;
	}
	public int getPositionY() {
	return positionY;
	}
	public Color getColor() {
	return color;
	}
	public void setPositionX(int positionX) {
	this.positionX = positionX;
	}
	public void setPositionY(int positionY) {
	this.positionY = positionY;
	}
	public void setColor(Color color) {
	this.color = color;
	}
	public void draw(Graphics g, int frame){
	return;
	}
	public void move(int frame){
	positionX += frame;
	positionY += frame;
	return;
	}
	
}
