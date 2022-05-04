package application;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Controleur implements ActionListener, MouseListener {
	
	Modele modl;
	
	public Controleur(Modele m) {
		this.modl = m;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String c = e.getActionCommand();
		this.modl.changerCouleur(BibliBriques.couleurs.get(c));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX());
		System.out.println(e.getY());
		this.modl.ajouterBrique(e.getX(), e.getY()); 
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}

	}
