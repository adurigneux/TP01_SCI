
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Cadre extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3255810397873787814L;

	public Color couleur=Color.RED;

	public Cadre(int x,int y){
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.x=x;this.y=y;
	}

	private int x,y;


	public void paintComponent(Graphics g){
		Rectangle r=g.getClipBounds();
		g.setColor(couleur);
		g.fillRect(0,0,r.width,r.height);
	}

}
