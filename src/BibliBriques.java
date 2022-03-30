import java.awt.Color;
import java.awt.Dimension;
import java.awt.List;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BibliBriques extends JPanel {
	
	public static Map<String, Color> couleurs = new HashMap();
	
/*	JButton brouge;
	JButton bbleu=new JButton();
	JButton bvert=new JButton();
*/	
	public BibliBriques(Controleur c) {
		String[] tabBriques= {"taille 50/30","  rouge","    brique 1","  bleu","    brique 2","  vert","    brique 3"};
		List jl=new List(10);
		for (int i=0; i<tabBriques.length; i++) {
			jl.add(tabBriques[i]);
		}
		this.add(jl);
		JButton brouge = new JButton("b1");
		brouge.setPreferredSize(new Dimension(75,75));
		brouge.setActionCommand("rouge");
		BibliBriques.couleurs.put("rouge", Color.red);
		this.add(brouge);
		brouge.addActionListener(c);
		
/*		
		bbleu.setLabel("b2");
		bbleu.setPreferredSize(new Dimension(75,75));
		this.add(bbleu);
		bvert.setLabel("b3");
		bvert.setPreferredSize(new Dimension(75,75));
		this.add(bvert);
		brouge.addActionListener(c);
		bbleu.addActionListener(c);
		bvert.addActionListener(c);
	*/
	}
	
}
