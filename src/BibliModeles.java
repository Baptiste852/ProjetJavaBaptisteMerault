import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BibliModeles extends JPanel implements ActionListener {
	
	Modele m=new Modele();
	Controleur c=new Controleur(m);
	JButton bm1 = new JButton("bm1");
	JButton bm2=new JButton("bm2");
	JButton bm3=new JButton("bm3");
	
	public BibliModeles() {
		String[] tabModeles= {"modele 1","modele 2"};
		List jl=new List(10);
		for (int i=0; i<tabModeles.length; i++) {
			jl.add(tabModeles[i]);
		}
		this.add(jl);
		bm1.setPreferredSize(new Dimension(75,75));
		bm1.setActionCommand("bm1");
		this.add(bm1);
		bm1.addActionListener(this);
		bm2.setPreferredSize(new Dimension(75,75));
		bm2.setActionCommand("bm2");
		this.add(bm2);
		bm2.addActionListener(this);
	}

	public static void main(String[] args) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VuePrincipale vp=new VuePrincipale(m, c);
		if (e.getActionCommand()=="bm1") {
			DRectangle r=new DRectangle();
			vp.add(r,BorderLayout.EAST);
		} else if (e.getActionCommand()=="bm2") {
			Pyramide p=new Pyramide();
			vp.add(p,BorderLayout.EAST);
		}
	}

}
