import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class DRectangle extends Canvas {
	
	public DRectangle() {
		this.setBackground(Color.cyan);
		this.setPreferredSize(new Dimension(640,360));
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.drawLine(200, 200, 250, 200);
		g.drawLine(200, 200, 200, 230);
		g.drawLine(250, 200, 250, 230);
		g.drawLine(200, 230, 250, 230);
		g.setColor(Color.red);
		g.fillRect(200, 200, 50, 30);
		g.setColor(Color.white);
		g.drawString("Lego", 210, 215);
		
		g.setColor(Color.white);
		g.drawLine(250, 200, 300, 200);
		g.drawLine(250, 200, 250, 230);
		g.drawLine(300, 200, 300, 230);
		g.drawLine(250, 230, 300, 230);
		g.setColor(Color.red);
		g.fillRect(250, 200, 50, 30);
		g.setColor(Color.white);
		g.drawString("Lego", 260, 215);
		
		g.setColor(Color.white);
		g.drawLine(200, 230, 250, 230);
		g.drawLine(200, 230, 200, 260);
		g.drawLine(250, 230, 250, 260);
		g.drawLine(200, 260, 250, 260);
		g.setColor(Color.red);
		g.fillRect(200, 230, 50, 30);
		g.setColor(Color.white);
		g.drawString("Lego", 210, 245);
		
		g.setColor(Color.white);
		g.drawLine(250, 230, 300, 230);
		g.drawLine(250, 230, 250, 260);
		g.drawLine(300, 230, 300, 260);
		g.drawLine(250, 260, 300, 260);
		g.setColor(Color.red);
		g.fillRect(250, 230, 50, 30);
		g.setColor(Color.white);
		g.drawString("Lego", 260, 245);
	}


	public static void main(String[] args) {
		
	}

}
