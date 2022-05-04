package application;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DRectangle extends Canvas {
	
	public DRectangle() {
		this.setBackground(Color.cyan);
		this.setPreferredSize(new Dimension(400,300));
	}
	
	@Override
	public void paint(Graphics g) {
		for (int i=0; i<=950; i=i+50) {
			for (int j=0; j<=560; j=j+30) {
				g.drawRect(i, j, 50, 30);
			}
		}
		g.setColor(Color.white);
		FileReader fr;
		try {
			fr = new FileReader("EnsBriques.txt");
			BufferedReader br=new BufferedReader(fr);
			try {
				for (int i=1; i<=52; i++) {
					if (i>=19 && i<=22) {
						String line=br.readLine();
						String[] parts=line.split(";");
						g.drawLine(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]));
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
		g.setColor(Color.red);
		g.fillRect(200, 200, 50, 30);
		g.setColor(Color.white);
		g.drawString("Lego", 210, 215);
		
		g.setColor(Color.white);
		FileReader fr2;
		try {
			fr2 = new FileReader("EnsBriques.txt");
			BufferedReader br2=new BufferedReader(fr2);
			try {
				for (int i=1; i<=52; i++) {
					if (i>=24 && i<=27) {
						String line=br2.readLine();
						String[] parts=line.split(";");
						g.drawLine(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]));
					} else {
						br2.readLine();
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
		g.setColor(Color.red);
		g.fillRect(250, 200, 50, 30);
		g.setColor(Color.white);
		g.drawString("Lego", 260, 215);
		
		g.setColor(Color.white);
		FileReader fr3;
		try {
			fr3 = new FileReader("EnsBriques.txt");
			BufferedReader br3=new BufferedReader(fr3);
			try {
				for (int i=1; i<=52; i++) {
					if (i>=29 && i<=32) {
						String line=br3.readLine();
						String[] parts=line.split(";");
						g.drawLine(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]));
					} else {
						br3.readLine();
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
		g.setColor(Color.red);
		g.fillRect(200, 230, 50, 30);
		g.setColor(Color.white);
		g.drawString("Lego", 210, 245);
		
		g.setColor(Color.white);
		FileReader fr4;
		try {
			fr4 = new FileReader("EnsBriques.txt");
			BufferedReader br4=new BufferedReader(fr4);
			try {
				for (int i=1; i<=52; i++) {
					if (i>=34 && i<=37) {
						String line=br4.readLine();
						String[] parts=line.split(";");
						g.drawLine(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]));
					} else {
						br4.readLine();
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
		g.setColor(Color.red);
		g.fillRect(250, 230, 50, 30);
		g.setColor(Color.white);
		g.drawString("Lego", 260, 245);
	}


	public static void main(String[] args) {
		
	}
}
