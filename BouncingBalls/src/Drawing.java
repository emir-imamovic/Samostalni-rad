import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Drawing extends JPanel implements ActionListener {
	int frame = 0;
	public static void main(String[] args) {
		JFrame jf = new JFrame("Drawing");
		jf.setSize(500, 500);
		jf.setLocation(600, 200);
		Jesenko newPanel = new Jesenko(jf.getSize());
		jf.setContentPane(newPanel);
		newPanel.repaint();

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		Timer t = new Timer(50, newPanel);
		t.start();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.GREEN);
		g.fillOval(50 + frame, 50 + frame, 50, 50);
		myMethod(g);
	}

	public void myMethod(Graphics gr) {
		gr.fillRect(100, 100, 100, 100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame++;
		//repaint();
	}

}
