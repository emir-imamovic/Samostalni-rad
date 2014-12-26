import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Circle {
	private int x;
	private int y;
	private int radius;
	private boolean isFilled;
	private Color color;
	private int speedX;
	private int speedY;
	private Dimension windowDim;
	private int centerX;
	private int centerY;
	private int halfRadius;

	public Circle(int x, int y, int radius, boolean isFilled, Color color,
			int speedX, int speedY, Dimension windowdDim) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.isFilled = isFilled;
		this.color = color;
		this.speedX = speedX;
		this.speedY = speedY;
		this.windowDim = windowdDim;
		centerX = x + radius / 2;
		centerY = y + radius / 2;
		halfRadius = radius / 2;
	}

	public void draw(Graphics g) {
		move();
		g.setColor(color);
		if (isFilled == true)
			g.fillOval(x, y, radius, radius);
		else
			g.drawOval(x, y, radius, radius);
	}

	private void move() {

		if (x < 0 || x + radius >= windowDim.getWidth())
			speedX *= -1;
		if (y < 0 || y + radius + 24 > windowDim.getHeight())
			speedY *= -1;
		

		x += speedX;
		y += speedY;
	}

	public void checkCollision(Circle circle1, Circle circle2) {
 /*int distance = (int) (Math.sqrt(Math.pow(circle2.centerX - circle1.centerX, 2)
				+ Math.pow(circle2.centerY - circle1.centerY, 2)));*/
 
 int distance = (int)(Math.sqrt(Math.pow((circle2.x + (circle2.radius/2)) - (circle1.x + (circle1.radius/2)) ,2) + 
		 Math.pow((circle2.y + (circle2.radius/2)) - (circle1.y + (circle2.radius/2)), 2)));
/* System.out.println("vrijednost x: " + x);
System.out.println("vrijednost y: " + y);
System.out.println("--------------------");
System.out.println("vrijednost circle1.x: " + circle1.x);
System.out.println("vrijednost circle1.y: " + circle1.y);
System.out.println("vrijednost circle2.x: " + circle2.x);
System.out.println("vrijednost circle2.y: " + circle2.y);
System.out.println("--------------------");
System.out.println(distance); */ 


		if (distance <= 70) {
			if (circle1.x == circle2.x) {
				circle1.speedY *= -1;
				circle2.speedY *= -1;
				
			}
			else if ( circle1.y == circle2.y) {
				circle1.speedX *= -1;
				circle2.speedX *= -1;
			}
			else if(circle1.x > circle2.x && circle1.y < circle2.y){
				circle1.speedY *= -1;
				circle2.speedY *= -1;
			}
			else if(circle1.x < circle2.x && circle1.y < circle2.y){
				circle1.speedX *= -1;
				circle2.speedX *= -1;
			}
			else if (circle2.x > circle1.x && circle2.y < circle1.y){
				circle1.speedX *= -1;
				circle2.speedX *= -1;
			}
			else if (circle2.x < circle1.x && circle2.y < circle1.y){
				circle1.speedX *= -1;
				circle2.speedX *= -1;
			}
		}
		
		x += speedX;
		y += speedY; 
		/* if(circle2.x + radius > circle1.x || circle2.y + radius > circle1.y || circle1.x + radius > circle2.x || circle1.y + radius > circle2.y){
		circle1.speedX *= -1;
		circle1.speedY *= -1;
		circle2.speedX *= -1;
		circle2.speedY *= -1;}
		bBoxRight > aBoxLeft && bBoxBottom > aBoxTop && aBoxRight > bBoxLeft && aBoxBottom > bBoxTop; */
		
	}
}
