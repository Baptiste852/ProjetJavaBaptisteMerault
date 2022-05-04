package application;

import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;

public class Modele2 {
	
	View2 v2;
	
	public Modele2(View2 view) {
		this.v2=view;
	}
	
	public void createBox(double x,double y,double z,Color c) {
		Box box=new Box(50,30,30);
		PhongMaterial material=new PhongMaterial(c);
		box.setTranslateX(x);
		box.setTranslateY(y);
		box.setTranslateZ(z);
		box.setMaterial(material);
		v2.group.getChildren().add(box);
	}
	
	public void createBox2(double x,double y,double z,Color c) {
		Cylinder cyl=new Cylinder(25,30);
		PhongMaterial material=new PhongMaterial(c);
		cyl.setTranslateX(x);
		cyl.setTranslateY(y);
		cyl.setTranslateZ(z);
		cyl.setMaterial(material);
		v2.group.getChildren().add(cyl);
	}
}
