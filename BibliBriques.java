package application;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.List;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BibliBriques extends JPanel {
	
	public static Map<String, Color> couleurs = new HashMap<>();
	JButton brouge = new JButton("brique 1");
	JButton bbleu=new JButton("brique 2");
	JButton bvert=new JButton("brique 3");
	
	public BibliBriques(Controleur c) {
		this.setBackground(Color.ORANGE);
		String[] tabBriques= {"taille 50/30","  rouge","    brique 1","  bleu","    brique 2","  vert","    brique 3"};
		List jl=new List(10);
		for (int i=0; i<tabBriques.length; i++) {
			jl.add(tabBriques[i]);
		}
		this.add(jl);
		JButton brouge = new JButton("brique 1");
		JButton bbleu=new JButton("brique 2");
		JButton bvert=new JButton("brique 3");
		brouge.setPreferredSize(new Dimension(150,75));
		brouge.setActionCommand("rouge");
		couleurs.put("rouge", Color.red);
		brouge.addActionListener(c);
		setPreferredSize(new Dimension(150,75));
		bbleu.setActionCommand("bleu");
		couleurs.put("bleu", Color.blue);
		bbleu.addActionListener(c);
		setPreferredSize(new Dimension(150,75));
		bvert.setActionCommand("vert");
		couleurs.put("vert", Color.green);
		bvert.addActionListener(c);
		this.add(brouge);
		this.add(bbleu);
		this.add(bvert);
	}
	
}
