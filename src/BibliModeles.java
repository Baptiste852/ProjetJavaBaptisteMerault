import java.awt.List;

import javax.swing.JPanel;

public class BibliModeles extends JPanel {
	
	public BibliModeles() {
		String[] tabModeles= {"modele 1","modele 2","modele 3","modele 4","modele 5"};
		List jl=new List(20);
		for (int i=0; i<tabModeles.length; i++) {
			jl.add(tabModeles[i]);
		}
		this.add(jl);
	}

	public static void main(String[] args) {
		
	}

}
