import java.awt.List;
import javax.swing.JPanel;

public class BibliBriques extends JPanel {
	
	public BibliBriques() {
		String[] tabBriques= {"taille 8","  rouge","    brique 1","  bleu","    brique 2","  vert","    brique 3"};
		List jl=new List(10);
		for (int i=0; i<tabBriques.length; i++) {
			jl.add(tabBriques[i]);
		}
		this.add(jl);
	}

	public static void main(String[] args) {
		
	}	
}
