package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.control.Tab;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;

public class Controleur2 {
	
	double anchorX, anchorY;
	double anchorAngleX = 0;
	double anchorAngleY = 0;
	
	Stack<Box> sb=new Stack<>();
	Stack<Cylinder> sc=new Stack<>();
	Stack<Box> sb2=new Stack<>();
	Stack<Cylinder> sc2=new Stack<>();
	int cpt=0;
	int cpt2=0;
	int cpt3=0;
	int cpt4=0;
	double x;
	double y;
	double z;
	
    public Controleur2(View2 view,Modele2 modl2){
        setView(view, modl2);
    }
    
    public void createBox(Group gr,double x,double y,double z,Color c) {
		Box box=new Box(50,30,30);
		PhongMaterial material=new PhongMaterial(c);
		box.setTranslateX(x);
		box.setTranslateY(y);
		box.setTranslateZ(z);
		box.setMaterial(material);
		gr.getChildren().add(box);
	}
	
	public void createBox2(Group gr,double x,double y,double z,Color c) {
		Cylinder cyl=new Cylinder(25,30);
		PhongMaterial material=new PhongMaterial(c);
		cyl.setTranslateX(x);
		cyl.setTranslateY(y);
		cyl.setTranslateZ(z);
		cyl.setMaterial(material);
		gr.getChildren().add(cyl);
	}
    
    public void setView(View2 view,Modele2 modl2){
    	view.scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent arg0) {
				if (arg0.getCode()==KeyCode.A) {
					cpt2+=1;
					for (int i=1; i<500; i++) {
						if (cpt2==i && cpt-i+1!=0) {
							if (view.group.getChildren().get(cpt-i+1).getClass()==Box.class) {
								sb.push((Box) view.group.getChildren().get(cpt-i+1));
							} else {
								sc.push((Cylinder) view.group.getChildren().get(cpt-i+1));
							}
							view.group.getChildren().remove(cpt-i+1);
						}
					}
				} else if (arg0.getCode()==KeyCode.Q) {
					view.group.getChildren().add(sb.peek());
					sb.pop();
				} else if (arg0.getCode()==KeyCode.S) {
					view.group.getChildren().add(sc.peek());
					sc.pop();
				}
			}
    	});
		view.lv.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
				if ((arg0.getY()>=50.6 && arg0.getY()<=69.3) || (arg0.getY()>=121.3 && arg0.getY()<=138) || (arg0.getY()>=192 && arg0.getY()<=212)) {
					if (arg0.getY()>=48.6 && arg0.getY()<=93.3) {
						view.co=Color.RED;
					} else if (arg0.getY()>=121.3 && arg0.getY()<=166.6) {
						view.co=Color.BLUE;
					} else if (arg0.getY()>=191.3 && arg0.getY()<=234.6) {
						view.co=Color.GREEN;
					}
					view.group.setOnMousePressed(new EventHandler<MouseEvent>() {
						public void handle(MouseEvent arg0) {
							double x=arg0.getX();
							double y=arg0.getY();
							double z=arg0.getZ();
							cpt+=1;
							modl2.createBox(x,y,z,view.co);
						}
					});
				} else if ((arg0.getY()>=74.6 && arg0.getY()<=91.3) || (arg0.getY()>=144 && arg0.getY()<=164) || (arg0.getY()>=215.3 && arg0.getY()<=233.3)) {
					if (arg0.getY()>=48.6 && arg0.getY()<=93.3) {
						view.co=Color.RED;
					} else if (arg0.getY()>=121.3 && arg0.getY()<=166.6) {
						view.co=Color.BLUE;
					} else if (arg0.getY()>=191.3 && arg0.getY()<=234.6) {
						view.co=Color.GREEN;
					}
					view.group.setOnMousePressed(new EventHandler<MouseEvent>() {
						public void handle(MouseEvent arg0) {
							double x=arg0.getX();
							double y=arg0.getY();
							double z=arg0.getZ();
							cpt+=1;
							modl2.createBox2(x,y,z,view.co);
						}
					});
				}
			}
		});
		view.lv2.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (arg0.getY()>=6 && arg0.getY()<=24) {
					FileReader fr;
					try {
						fr = new FileReader("EnsBriques.txt");
						BufferedReader br=new BufferedReader(fr);
						try {
							for (int i=1; i<=52; i++) {
								if (i<=4) {
									String[] parts=br.readLine().split(";");
									modl2.createBox(Double.parseDouble(parts[0]),Double.parseDouble(parts[1]),Double.parseDouble(parts[2]),Color.RED);
								} else {
									br.readLine();
								}
							}
						} catch (NumberFormatException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
				} else if (arg0.getY()>=28 && arg0.getY()<=48) {
					FileReader fr;
					try {
						fr = new FileReader("EnsBriques.txt");
						BufferedReader br=new BufferedReader(fr);
						try {
							for (int i=1; i<=52; i++) {
								if (i>=6 && i<=8) {
									String[] parts=br.readLine().split(";");
									modl2.createBox(Double.parseDouble(parts[0]),Double.parseDouble(parts[1]),Double.parseDouble(parts[2]),Color.BLUE);
								} else {
									br.readLine();
								}
							}
						} catch (NumberFormatException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
				} else if (arg0.getY()>=49.3 && arg0.getY()<=67.3) {
					FileReader fr;
					try {
						fr = new FileReader("EnsBriques.txt");
						BufferedReader br=new BufferedReader(fr);
						try {
							for (int i=1; i<=52; i++) {
								if (i>=10 && i<=13) {
									String[] parts=br.readLine().split(";");
									modl2.createBox2(Double.parseDouble(parts[0]),Double.parseDouble(parts[1]),Double.parseDouble(parts[2]),Color.RED);
								} else {
									br.readLine();
								}
							}
						} catch (NumberFormatException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
				} else if (arg0.getY()>=74.6 && arg0.getY()<=92.6) {
					FileReader fr;
					try {
						fr = new FileReader("EnsBriques.txt");
						BufferedReader br=new BufferedReader(fr);
						try {
							for (int i=1; i<=52; i++) {
								if (i>=15 && i<=17) {
									String[] parts=br.readLine().split(";");
									modl2.createBox2(Double.parseDouble(parts[0]),Double.parseDouble(parts[1]),Double.parseDouble(parts[2]),Color.BLUE);
								} else {
									br.readLine();
								}
							}
						} catch (NumberFormatException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
				}
			}
		});
		view.vp.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				VuePrincipale vp=new VuePrincipale(view.m, view.cont);
			}
		});
		view.scene3.setOnMousePressed(event -> {
		     view.anchorX = event.getSceneX();
		     view.anchorY = event.getSceneY();
		     view.anchorAngleX = view.angleX.get();
		     view.anchorAngleY = view.angleY.get();
		});
		view.scene3.setOnMouseDragged(event -> {
			view.angleX.set(view.anchorAngleX - (view.anchorY - event.getSceneY()));
			view.angleY.set(view.anchorAngleY + view.anchorX - event.getSceneX());
		}); 
		view.addTab.setOnAction(event -> {
			Tab tab=new Tab("New Tab");
			Group group=new Group();
			Box base = new Box(600,20,600);
			PhongMaterial material=new PhongMaterial(Color.BURLYWOOD);
			base.setMaterial(material);
			final DoubleProperty angleX = new SimpleDoubleProperty(0);
			final DoubleProperty angleY = new SimpleDoubleProperty(0);
			group.translateXProperty().set(400);
			group.translateYProperty().set(350);
			group.translateZProperty().set(0);
			group.getChildren().add(base);
			Rotate xRotate2;
			Rotate yRotate2;
			((Node) group).getTransforms().addAll(
				xRotate2 = new Rotate(0, Rotate.X_AXIS),
				yRotate2= new Rotate(0, Rotate.Y_AXIS)
			);
			xRotate2.angleProperty().bind(angleX);
			yRotate2.angleProperty().bind(angleY);
			SubScene scene=new SubScene(group,750,750,true,SceneAntialiasing.BALANCED);
			view.scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
				@Override
				public void handle(KeyEvent arg0) {
					if (arg0.getCode()==KeyCode.Z) {
						cpt4+=1;
						for (int i=1; i<500; i++) {
							if (cpt4==i && cpt3-i+1!=0) {
								if (group.getChildren().get(cpt3-i+1).getClass()==Box.class) {
									sb2.push((Box) group.getChildren().get(cpt3-i+1));
								} else {
									sc2.push((Cylinder) group.getChildren().get(cpt3-i+1));
								}
								group.getChildren().remove(cpt3-i+1);
							}
						}
					} else if (arg0.getCode()==KeyCode.W) {
						group.getChildren().add(sb2.peek());
						sb2.pop();
					} else if (arg0.getCode()==KeyCode.X) {
						group.getChildren().add(sc2.peek());
						sc2.pop();
					}
				}
	    	});
			scene.setOnMousePressed(event2 -> {
			     anchorX = event2.getSceneX();
			     anchorY = event2.getSceneY();
			     anchorAngleX = angleX.get();
			     anchorAngleY = angleY.get();
			});
			scene.setOnMouseDragged(event3 -> {
				angleX.set(anchorAngleX - (anchorY - event3.getSceneY()));
				angleY.set(anchorAngleY + anchorX - event3.getSceneX());
			});
			view.lv.setOnMouseClicked(new EventHandler<MouseEvent>() {
				public void handle(MouseEvent arg0) {
					if ((arg0.getY()>=50.6 && arg0.getY()<=69.3) || (arg0.getY()>=121.3 && arg0.getY()<=138) || (arg0.getY()>=192 && arg0.getY()<=212)) {
						if (arg0.getY()>=48.6 && arg0.getY()<=93.3) {
							view.co=Color.RED;
						} else if (arg0.getY()>=121.3 && arg0.getY()<=166.6) {
							view.co=Color.BLUE;
						} else if (arg0.getY()>=191.3 && arg0.getY()<=234.6) {
							view.co=Color.GREEN;
						}
						group.setOnMousePressed(new EventHandler<MouseEvent>() {
							public void handle(MouseEvent arg0) {
								double x=arg0.getX();
								double y=arg0.getY();
								double z=arg0.getZ();
								cpt3+=1;
								createBox(group,x,y,z,view.co);
							}
						});
					} else if ((arg0.getY()>=74.6 && arg0.getY()<=91.3) || (arg0.getY()>=144 && arg0.getY()<=164) || (arg0.getY()>=215.3 && arg0.getY()<=233.3)) {
						if (arg0.getY()>=48.6 && arg0.getY()<=93.3) {
							view.co=Color.RED;
						} else if (arg0.getY()>=121.3 && arg0.getY()<=166.6) {
							view.co=Color.BLUE;
						} else if (arg0.getY()>=191.3 && arg0.getY()<=234.6) {
							view.co=Color.GREEN;
						}
						group.setOnMousePressed(new EventHandler<MouseEvent>() {
							public void handle(MouseEvent arg0) {
								double x=arg0.getX();
								double y=arg0.getY();
								double z=arg0.getZ();
								cpt3+=1;
								createBox2(group,x,y,z,view.co);
							}
						});
					}
				}
			});
			view.lv2.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent arg0) {
					if (arg0.getY()>=6 && arg0.getY()<=24) {
						FileReader fr;
						try {
							fr = new FileReader("EnsBriques.txt");
							BufferedReader br=new BufferedReader(fr);
							try {
								for (int i=1; i<=52; i++) {
									if (i<=4) {
										String[] parts=br.readLine().split(";");
										createBox(group,Double.parseDouble(parts[0]),Double.parseDouble(parts[1]),Double.parseDouble(parts[2]),Color.RED);
									} else {
										br.readLine();
									}
								}
							} catch (NumberFormatException e) {
								e.printStackTrace();
							} catch (IOException e) {
								e.printStackTrace();
							}
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						}
					} else if (arg0.getY()>=28 && arg0.getY()<=48) {
						FileReader fr;
						try {
							fr = new FileReader("EnsBriques.txt");
							BufferedReader br=new BufferedReader(fr);
							try {
								for (int i=1; i<=52; i++) {
									if (i>=6 && i<=8) {
										String[] parts=br.readLine().split(";");
										createBox(group,Double.parseDouble(parts[0]),Double.parseDouble(parts[1]),Double.parseDouble(parts[2]),Color.BLUE);
									} else {
										br.readLine();
									}
								}
							} catch (NumberFormatException e) {
								e.printStackTrace();
							} catch (IOException e) {
								e.printStackTrace();
							}
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						}
					} else if (arg0.getY()>=49.3 && arg0.getY()<=67.3) {
						FileReader fr;
						try {
							fr = new FileReader("EnsBriques.txt");
							BufferedReader br=new BufferedReader(fr);
							try {
								for (int i=1; i<=52; i++) {
									if (i>=10 && i<=13) {
										String[] parts=br.readLine().split(";");
										createBox2(group,Double.parseDouble(parts[0]),Double.parseDouble(parts[1]),Double.parseDouble(parts[2]),Color.RED);
									} else {
										br.readLine();
									}
								}
							} catch (NumberFormatException e) {
								e.printStackTrace();
							} catch (IOException e) {
								e.printStackTrace();
							}
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						}
					} else if (arg0.getY()>=74.6 && arg0.getY()<=92.6) {
						FileReader fr;
						try {
							fr = new FileReader("EnsBriques.txt");
							BufferedReader br=new BufferedReader(fr);
							try {
								for (int i=1; i<=52; i++) {
									if (i>=15 && i<=17) {
										String[] parts=br.readLine().split(";");
										createBox2(group,Double.parseDouble(parts[0]),Double.parseDouble(parts[1]),Double.parseDouble(parts[2]),Color.BLUE);
									} else {
										br.readLine();
									}
								}
							} catch (NumberFormatException e) {
								e.printStackTrace();
							} catch (IOException e) {
								e.printStackTrace();
							}
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						}
					}
				}
			});
			tab.setStyle("-fx-background-color: #F0FFF0");
			tab.setContent(scene);
			view.tab1.setContent(view.scene3);
	        view.tabPane.getTabs().add(tab); 
	        view.tabPane.getSelectionModel().selectLast(); 
	    });
    }
	
	public static void main(String[] args) {
		
		
	}
}
