package Server;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CEnvironement extends Canvas implements MouseListener {
	
	private List<Ressource> listRessource;
	public ArrayList<Obstacle> listObstacles;
	
	
	public CEnvironement(int h, int l) 
	{
		super();
		setSize(l,h);		
		setBackground(Color.GRAY);
	    setVisible(true);
	    addMouseListener(this);
	    listObstacles = new ArrayList<Obstacle>();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	
	public void paint(Graphics g) {
	    for(Obstacle o : listObstacles)
	    {
	    	System.out.println(o.posX);
	    	o.afficher(g);
	    }
	 }
	
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		 int x=e.getX();
		 int y=e.getY();
		
		 listObstacles.add(new Obstacle(x, y, 4));
		 paint(this.getGraphics());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
}
