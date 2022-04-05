import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import javax.media.j3d.Canvas3D;

public class Canvas2 extends Canvas3D {

	public Canvas2(GraphicsConfiguration arg0) {
		super(arg0);
		this.setPreferredSize(new Dimension(640,360));
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		
	}

}
