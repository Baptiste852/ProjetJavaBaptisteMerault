import java.awt.List;
import javax.swing.JPanel;

public class BibliBriques extends JPanel {
	
	public BibliBriques() {
		String[] tabBriques= {"brique 1","brique 2","brique 3","brique 4","brique 5"};
		List jl=new List(20);
		for (int i=0; i<tabBriques.length; i++) {
			jl.add(tabBriques[i]);
		}
		this.add(jl);
	}

	public static void main(String[] args) {
		
	}

}
