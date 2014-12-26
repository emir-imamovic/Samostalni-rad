import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;


public class Jesenko extends JPanel implements ActionListener{
	Dimension windowSize;
	Circle ball;
	Circle ball1;
	public Jesenko (Dimension windowSize){
		this.windowSize = windowSize;
		ball = new Circle(0, 0, 70, true, Color.YELLOW, 2, 3, windowSize);
		ball1 = new Circle(400, 400, 70, false, Color.BLUE, 5, 4, windowSize);
	}
	
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		ball.checkCollision(ball, ball1);
		ball.draw(g);
		ball1.draw(g);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		repaint();
		
	}
	
}
