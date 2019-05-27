package Server;
import java.awt.Color;
import java.awt.Graphics;

public class Ressource extends CObject {
	public double rayon = 10;
	Color color;
	public int quantite = 10;
	public double quantiteInit = 10;
	
	
	public Ressource(double _x, double _y,  double _rayon, Color _color, int _quantite) {
		this.posX = _x;
		this.posY = _y;
		this.rayon = _rayon;
		this.color = _color;
		this.quantite = _quantite;
		this.quantiteInit = _quantite;
	}
	
	public void afficher(Graphics pG) 
	{
		if(this.quantite == 0)
			return;
		
		pG.setColor(color);
		pG.drawArc((int)(this.posX-this.rayon/2), (int)(this.posY-this.rayon/2), (int)this.rayon, (int)this.rayon, 0, 360);
		int temp = (int)(quantite / quantiteInit*rayon);
		pG.fillOval((int)(this.posX-temp/2), (int)(this.posY-temp/2), temp, temp);
		
	}
	
	public void decreaseSize()
	{
		if(quantite > 0) {
			quantite--;
		}
	}
}