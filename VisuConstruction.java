package application;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

public class VisuConstruction extends Canvas implements Observer {
	
	Modele modl;
	
	public VisuConstruction(Controleur c, Modele m) {
		this.setBackground(Color.cyan);
		this.addMouseListener(c);
		this.setPreferredSize(new Dimension(200,200));
		m.addObserver(this);
		this.modl = m;
	}
	
	@Override
	public void paint(Graphics g) {
		for (int i=0; i<=950; i=i+50) {
			for (int j=0; j<=560; j=j+30) {
				g.drawRect(i, j, 50, 30);
			}
		}
		for (Brique b : this.modl.constr) {
			g.setColor(Color.white);
			g.drawLine(b.x, b.y, b.x+50, b.y);
			g.drawLine(b.x, b.y, b.x, b.y+30);
			g.drawLine(b.x+50, b.y, b.x+50, b.y+30);
			g.drawLine(b.x, b.y+30, b.x+50, b.y+30);
			g.setColor(b.couleur);
			g.fillRect(b.x, b.y, 50, 30);
			g.setColor(Color.white);
			g.drawString("Lego", b.x+10, b.y+15);
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("La modèle a changé");
		this.repaint();
	}


}
