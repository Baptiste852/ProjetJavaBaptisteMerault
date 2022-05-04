package application;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VuePrincipale extends JFrame {
	
	public VuePrincipale(Modele m, Controleur c) {
		this.setSize(200,200);
		this.setTitle("My Lego Game");
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BibliBriques bb=new BibliBriques(c);
		this.add(bb,BorderLayout.WEST);
		VisuConstruction vc=new VisuConstruction(c, m);
		BibliModeles bm=new BibliModeles();
		this.add(bm, BorderLayout.EAST);
		this.add(vc,BorderLayout.CENTER);
		EnsB eb=new EnsB();
		this.add(eb, BorderLayout.NORTH);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		Modele modl = new Modele();
		
		Controleur ctrl = new Controleur(modl); 
		
		VuePrincipale g=new VuePrincipale(modl, ctrl);
		
	}
}
