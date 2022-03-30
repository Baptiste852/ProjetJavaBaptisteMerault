import java.awt.BorderLayout;
import javax.swing.JFrame;

public class VuePrincipale {
	
	public VuePrincipale(Modele m, Controleur c) {
		JFrame frame=new JFrame();
		frame.setSize(500,500);
		frame.setTitle("My Lego Game");
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BibliBriques bb=new BibliBriques(c);
		frame.add(bb,BorderLayout.WEST);
		BibliModeles bm=new BibliModeles();
		frame.add(bm,BorderLayout.CENTER);
		VisuConstruction vc=new VisuConstruction(c, m);
		frame.add(vc,BorderLayout.EAST);
		BEnreg be=new BEnreg();
		frame.add(be,BorderLayout.SOUTH);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		
		Modele modl = new Modele();
		
		Controleur ctrl = new Controleur(modl); 
		
		VuePrincipale g=new VuePrincipale(modl, ctrl);
	}
}
