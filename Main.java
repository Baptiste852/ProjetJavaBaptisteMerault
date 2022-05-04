package application;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage arg0) throws Exception {
		View2 v2=new View2();
		Modele2 m2=new Modele2(v2);
		Controleur2 c2=new Controleur2(v2, m2);
		arg0.setTitle("My Lego Game");
		arg0.setResizable(true);
		arg0.setScene(v2.scene);
		arg0.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
