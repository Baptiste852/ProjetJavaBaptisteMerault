import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Gestion {
	
	public Gestion() {
		JFrame frame=new JFrame();
		frame.setSize(500,500);
		frame.setTitle("Lego Game");
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BibliBriques bb=new BibliBriques();
		frame.add(bb,BorderLayout.WEST);
		BibliModeles bm=new BibliModeles();
		frame.add(bm,BorderLayout.CENTER);
		VisuConstruction vc=new VisuConstruction();
		frame.add(vc,BorderLayout.EAST);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		
		Gestion g=new Gestion();
	}

}
