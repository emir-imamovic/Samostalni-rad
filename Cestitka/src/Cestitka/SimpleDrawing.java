package Cestitka;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Closeable;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SimpleDrawing extends JPanel implements ActionListener {
	int frame = 0;
	static Snow snow;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawFrame(g, frame++);
	}

	public void drawFrame(Graphics g, int frameNumber) {
		Snowman s = new Snowman(400, 480, new Color(240, 255, 255, 255));
		Snowman s1 = new Snowman(1200, 480, new Color(240, 255, 255, 255));
		s.draw(g, frameNumber);
		g.setColor(new Color(250, 255, 50, 230));
		g.fillOval(555, 55, 65, 65);
		s1.draw(g, frameNumber);
		g.setColor(new Color(250, 255, 50, 230));
		g.fillOval(555, 55, 65, 65);
		g.setColor(new Color(40, 70, 110, 255));
		g.fillOval(570, 55, 65, 65);
		g.setColor(new Color(250, 255, 50, 30));
		g.fillOval(540, 43, 90, 90);
		Graphics2D g2d = (Graphics2D) g;
		g.setColor(Color.LIGHT_GRAY);
		Font bF = new Font("Calibri", Font.BOLD, 65);
		g2d.setFont(bF);
		g2d.drawString("Happy Holidays", 200, 250);
		g.setColor(Color.LIGHT_GRAY);
		Font bFF = new Font("Calibri", Font.ITALIC, 45);
		g2d.setFont(bFF);
		g2d.drawString("from bit.Camp()", 270, 300);
		snow.draw(g, frameNumber);
	}

	public void actionPerformed(ActionEvent evt) {
		repaint();
	}

	public static void main(String[] args) {
		JFrame window = new JFrame("Happy Hollydays");
		SimpleDrawing drawArea = new SimpleDrawing();
		Color bck = new Color(40, 70, 110, 255);
		drawArea.setBackground(bck);
		window.setContentPane(drawArea);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double screenWidth = screenSize.getWidth();
		double screenHeight = screenSize.getHeight();
		int windowHeight = 800;
		int windowWidth = 600;
		int positionHeight = (int) (screenHeight - windowHeight) / 2;
		int positionWidth = (int) (screenWidth - windowWidth) / 2;
		window.setSize(windowHeight, windowWidth);
		window.setLocation(positionWidth, positionHeight);
		window.setResizable(false);
		Timer frameTimer = new Timer(40, drawArea);
		snow = new Snow(Color.WHITE, windowHeight);
		window.setVisible(true);
		frameTimer.start();
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
	}

}
