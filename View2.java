package application;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;

public class View2 {
	
	public Modele m=new Modele();
    public Controleur cont=new Controleur(m);
	
    public Button addTab = new Button("Ajouter un nouvel onglet");
    public TabPane tabPane=new TabPane();
    public Tab tab1=new Tab("Main Tab");
	public BorderPane bp=new BorderPane();
	public Scene scene=new Scene(bp,500,500);
	public Button vp=new Button("Visualisation 2D");
	public Color co=Color.BLACK;
	public HBox hb=new HBox();
	public VBox vb=new VBox();
	public HBox hb2=new HBox();
	public HBox hb3=new HBox();
	public ListView<String> lv=new ListView<>();
	public ListView<String> lv2=new ListView<>();
	public TilePane tp=new TilePane();
	public Group group=new Group();
	public SubScene scene2=new SubScene(tabPane,750,750);
	public SubScene scene3=new SubScene(group,750,750,true,SceneAntialiasing.BALANCED);
	double anchorX, anchorY;
	double anchorAngleX = 0;
	double anchorAngleY = 0;
	final DoubleProperty angleX = new SimpleDoubleProperty(0);
	final DoubleProperty angleY = new SimpleDoubleProperty(0);
	Box base = new Box(600,20,600);
	
    Parent view;

	public View2() {
		view = createView();
	}
	
	 private BorderPane createView() {
		tab1.setContent(scene3);
		tabPane.getTabs().add(tab1);
		group.translateXProperty().set(400);
		group.translateYProperty().set(350);
		group.translateZProperty().set(0);
		group.getChildren().add(base);
		tp.setPrefSize(200, 200);
		tp.getChildren().addAll(vp,addTab);
		lv.getItems().addAll("taille 50/30","  rouge","    brique 1","    brique 2","  bleu","    brique 3","    brique 4","  vert","    brique 5","    brique 6");
		lv2.getItems().addAll("modele 1","modele 2","modele 3","modele 4");
		hb.getChildren().addAll(vp,addTab);
		vb.getChildren().add(scene2);
		hb2.getChildren().add(lv);
		hb3.getChildren().add(lv2);
		bp.setTop(hb);
		bp.setCenter(vb);
		bp.setRight(hb2);
		bp.setLeft(hb3);
		Rotate xRotate2;
		Rotate yRotate2;
		((Node) group).getTransforms().addAll(
			xRotate2 = new Rotate(0, Rotate.X_AXIS),
			yRotate2= new Rotate(0, Rotate.Y_AXIS)
		);
		xRotate2.angleProperty().bind(angleX);
		yRotate2.angleProperty().bind(angleY);
		return bp;
	}
	
	public static void main(String[] args) {
		
		
	}
}
