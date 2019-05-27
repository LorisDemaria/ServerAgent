package Server;
import java.awt.Color;
import java.awt.Graphics;

public class Ressource extends CObject {
	public double rayon = 100;
	Color color;
	public int quantite = 10;
	
	
	public Ressource(double _x, double _y,  double _rayon, Color _color) {
		this.posX = _x;
		this.posY = _y;
		this.rayon = _rayon;
		this.color = _color;
	}
	
	public void afficher(Graphics pG) 
	{
		pG.setColor(color);
		pG.fillArc((int)(this.posX-this.rayon/2), (int)(this.posY-this.rayon/2), (int)this.rayon, (int)this.rayon, 0, 360);
		pG.fillOval((int)(this.posX-this.rayon/2), (int)(this.posY-this.rayon/2), (int)quantite, (int)quantite);
		
	}
	
	public void decreaseSize()
	{
		if(quantite > 0 && rayon > 0 ) {
			quantite--;
			rayon--;
		}
		else {
			System.out.println("plus de nourriture");
		}
	}
}