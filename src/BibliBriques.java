import java.awt.Dimension;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BibliBriques extends JPanel implements ActionListener {
	
	JButton brouge=new JButton();
	JButton bbleu=new JButton();
	JButton bvert=new JButton();
	
	public BibliBriques() {
		String[] tabBriques= {"taille 50/30","  rouge","    brique 1","  bleu","    brique 2","  vert","    brique 3"};
		List jl=new List(10);
		for (int i=0; i<tabBriques.length; i++) {
			jl.add(tabBriques[i]);
		}
		this.add(jl);
		brouge.setLabel("b1");
		brouge.setPreferredSize(new Dimension(50,50));
		this.add(brouge);
		bbleu.setLabel("b2");
		bbleu.setPreferredSize(new Dimension(50,50));
		this.add(bbleu);
		bvert.setLabel("b3");
		bvert.setPreferredSize(new Dimension(50,50));
		this.add(bvert);
		brouge.addActionListener(this);
		bbleu.addActionListener(this);
		bvert.addActionListener(this);
	}

	public static void main(String[] args) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==brouge) {
			
		} else if (e.getSource()==bbleu) {
			
		} else if (e.getSource()==bvert) {
			
		}
	}	
}
