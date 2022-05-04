package application;

import javax.swing.JPanel;

public class EnsB extends JPanel {
	
	BibliModeles bm=new BibliModeles();
	
	public EnsB() {
		this.add(bm.bm1);
		this.add(bm.bm2);
	}

	public static void main(String[] args) {
		
	}

}
