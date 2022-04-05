import java.awt.Color;
import java.awt.Dimension;
import java.awt.List;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BibliBriques extends JPanel {
	
	public static Map<String, Color> couleurs = new HashMap();
	JButton brouge = new JButton("b1");
	JButton bbleu=new JButton("b2");
	JButton bvert=new JButton("b3");
	
	public BibliBriques(Controleur c) {
		String[] tabBriques= {"taille 50/30","  rouge","    brique 1","  bleu","    brique 2","  vert","    brique 3"};
		List jl=new List(10);
		for (int i=0; i<tabBriques.length; i++) {
			jl.add(tabBriques[i]);
		}
		this.add(jl);
		brouge.setPreferredSize(new Dimension(75,75));
		brouge.setActionCommand("rouge");
		BibliBriques.couleurs.put("rouge", Color.red);
		this.add(brouge);
		brouge.addActionListener(c);
		bbleu.setPreferredSize(new Dimension(75,75));
		bbleu.setActionCommand("bleu");
		BibliBriques.couleurs.put("bleu", Color.blue);
		this.add(bbleu);
		bbleu.addActionListener(c);
		bvert.setPreferredSize(new Dimension(75,75));
		bvert.setActionCommand("vert");
		BibliBriques.couleurs.put("vert", Color.green);
		this.add(bvert);
		bvert.addActionListener(c);
	}
	
}
