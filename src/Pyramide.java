import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Pyramide extends Canvas {
	
	public Pyramide() {
		this.setBackground(Color.cyan);
		this.setPreferredSize(new Dimension(640,360));
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.drawLine(200, 200, 250, 200);
		g.drawLine(200, 200, 200, 230);
		g.drawLine(250, 200, 250, 230);
		g.drawLine(200, 230, 250, 230);
		g.setColor(Color.blue);
		g.fillRect(200, 200, 50, 30);
		g.setColor(Color.white);
		g.drawString("Lego", 210, 215);
		
		g.setColor(Color.white);
		g.drawLine(250, 200, 300, 200);
		g.drawLine(250, 200, 250, 230);
		g.drawLine(300, 200, 300, 230);
		g.drawLine(250, 230, 300, 230);
		g.setColor(Color.blue);
		g.fillRect(250, 200, 50, 30);
		g.setColor(Color.white);
		g.drawString("Lego", 260, 215);
		
		g.setColor(Color.white);
		g.drawLine(225, 200, 275, 200);
		g.drawLine(225, 200, 225, 170);
		g.drawLine(275, 200, 275, 170);
		g.drawLine(225, 170, 275, 170);
		g.setColor(Color.blue);
		g.fillRect(225, 170, 50, 30);
		g.setColor(Color.white);
		g.drawString("Lego", 235, 185);
	}


	public static void main(String[] args) {
		
	}

}
