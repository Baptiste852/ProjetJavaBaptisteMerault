import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class VisuConstruction extends Canvas implements MouseListener,KeyListener {
	
	Briques br=new Briques();
	String imageDefault =br.get(0);
	Image img = null;
	
	public VisuConstruction() {
		this.setBackground(Color.cyan);
		this.addMouseListener(this);
		this.setPreferredSize(new Dimension(640,360));
		this.addKeyListener(this);
		try {
			img = ImageIO.read(new File(imageDefault));
		} catch (IOException e1) {
			throw new RuntimeException("L'image "+imageDefault+" est introuvable");
		}
	}
	
	public void paint2(Graphics g,int x,int y) {
		g.drawImage(img, x, y, 50, 50, null);
	}
	
	public static void main(String[] args) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		paint2(getGraphics(),e.getX(),e.getY());
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyChar()=='a') {
			
		} else if (e.getKeyChar()=='z') {
			
		} else if (e.getKeyChar()=='e') {
			
		}
	}

}
