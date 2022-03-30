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
		this.setPreferredSize(new Dimension(640,360));
		m.addObserver(this);
		this.modl = m;
	}
	
	@Override
	public void paint(Graphics g) {
		for (Brique b : this.modl.constr) {
			g.setColor(b.couleur);
			g.drawLine(b.x, b.y, b.x+50, b.y);
			g.drawLine(b.x, b.y, b.x, b.y+30);
			g.drawLine(b.x+50, b.y, b.x+50, b.y+30);
			g.drawLine(b.x, b.y+30, b.x+50, b.y+30);
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("La modèle a changé");
		this.repaint();
	}


}
