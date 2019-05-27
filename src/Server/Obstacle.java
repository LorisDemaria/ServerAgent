package Server;

import java.awt.Color;
import java.awt.Graphics;

public class Obstacle extends CObject {
	public double rayon;
	public Color color;
	
	public Obstacle(double _x, double _y, double _rayon, Color _color) {
        this.posX = _x;
        this.posY = _y;
        rayon = _rayon;
        this.color = _color;
    }
	
	public void afficher(Graphics pG) 
	{
		pG.setColor(color);
		pG.fillRect((int) (this.posX - this.rayon/2), (int)(this.posY-this.rayon/2), (int)rayon, (int)rayon);
	}
}