import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class VisuConstruction extends Canvas implements MouseListener {
	
	public VisuConstruction() {
		this.setBackground(Color.cyan);
		this.addMouseListener(this);
		this.setPreferredSize(new Dimension(640,360));
	}
	
	public void paint1(Graphics g,int x,int y) {
		g.setColor(Color.red);
		g.drawLine(x, y, x+50, y);
		g.drawLine(x, y, x, y+30);
		g.drawLine(x+50, y, x+50, y+30);
		g.drawLine(x, y+30, x+50, y+30);
	}
	
	public void paint2(Graphics g,int x,int y) {
		g.setColor(Color.blue);
		g.drawLine(x, y, x+50, y);
		g.drawLine(x, y, x, y+30);
		g.drawLine(x+50, y, x+50, y+30);
		g.drawLine(x, y+30, x+50, y+30);
	}
	
	public void paint3(Graphics g,int x,int y) {
		g.setColor(Color.green);
		g.drawLine(x, y, x+50, y);
		g.drawLine(x, y, x, y+30);
		g.drawLine(x+50, y, x+50, y+30);
		g.drawLine(x, y+30, x+50, y+30);
	}
	
	public static void main(String[] args) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		paint1(getGraphics(),e.getX(),e.getY());
	}

}
