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
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;

public class View2 {
	
	public Modele m=new Modele();
    public Controleur cont=new Controleur(m);
	
    public TextArea ta=new TextArea();
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
	PhongMaterial material=new PhongMaterial(Color.BURLYWOOD);

    Parent view;

	public View2() {
		view = createView();
	}
	
	 private BorderPane createView() { 
		ta.setPrefSize(500,50);
		ta.setText("GUIDE DES TOUCHES ET AVERTISSEMENTS\n\n"
				+ "touche A : supprimer le dernier bloc pos?? dans le Main Tab\n"
				+ "touche Z : supprimer le dernier bloc pos?? dans le New Tab\n"
				+ "touche Q : reposer le dernier bloc supprimer seulement si il s'agit de la brique 1 ou 3 ou 5 dans le Main Tab\n"
				+ "touche S : reposer le dernier bloc supprimer seulement si il s'agit de la brique 2 ou 4 ou 6 dans le Main Tab\n"
				+ "touche W : reposer le dernier bloc supprimer seulement si il s'agit de la brique 1 ou 3 ou 5 dans le New Tab\n"
				+ "touche X : reposer le dernier bloc supprimer seulement si il s'agit de la brique 2 ou 4 ou 6 dans le New Tab\n"
				+ "AVERTISSEMENT 1 : Le fait d'empiler 2 briques diff??rentes entra??ne des probl??mes de collisions. Il faut donc empiler des briques de m??me type.");
		ta.setStyle("-fx-control-inner-background: #F0FFF0");
		bp.setStyle("-fx-background-color: #90EE90");
		addTab.setStyle("-fx-text-fill: #0000ff ; -fx-border-color : #0000ff ;");
		vp.setStyle("-fx-text-fill: #0000ff ; -fx-border-color : #0000ff ;");
		base.setMaterial(material);
		tab1.setContent(scene3);
		tab1.setStyle("-fx-background-color: #F0FFF0");
		tabPane.getTabs().add(tab1);
		tabPane.setStyle("-fx-background-color: #87CEFA");
		group.translateXProperty().set(400);
		group.translateYProperty().set(350);
		group.translateZProperty().set(0);
		group.getChildren().add(base);
		tp.setPrefSize(200, 200);
		tp.getChildren().addAll(vp,addTab);
		lv.getItems().addAll("taille 50/30","  rouge","    brique 1","    brique 2","  bleu","    brique 3","    brique 4","  vert","    brique 5","    brique 6");
		lv2.getItems().addAll("modele 1","modele 2","modele 3","modele 4");
		lv.setStyle("-fx-border-color : #FF00FF ; -fx-control-inner-background: #FFFACD ;");
		lv2.setStyle("-fx-border-color : #FF00FF ; -fx-control-inner-background: #FFFACD ;");
		hb.getChildren().addAll(ta,vp,addTab);
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
