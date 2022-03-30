import java.awt.Color;
import java.util.Observable;

public class Modele extends Observable {

	Construction constr;
	
	private Color couleurChoisie = Color.black;
	
	public Modele() {
		this.constr = new Construction();
	}
	
	public void changerCouleur(Color c) {
		this.couleurChoisie = c;
	}

	public void ajouterBrique(int x, int y) {
		Brique b = new Brique(x, y, this.couleurChoisie);
		this.constr.add(b);
		this.setChanged();
		this.notifyObservers();
	}
	
}
