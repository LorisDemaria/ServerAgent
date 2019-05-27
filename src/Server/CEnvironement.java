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
import javax.swing.SwingUtilities;

public class CEnvironement extends Canvas implements MouseListener {
	
	private static final int SIZE = 16;
	
	private ArrayList<Ressource> listRessources;
	public ArrayList<Obstacle> listObstacles;
	
	
	public CEnvironement(int h, int l) 
	{
		super();
		setSize(l,h);		
		setBackground(Color.GRAY);
	    setVisible(true);
	    addMouseListener(this);
	    listObstacles = new ArrayList<Obstacle>();
	    listRessources = new ArrayList<Ressource>();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	
	public void paint(Graphics g) {
	    for(Obstacle o : listObstacles)
	    {
	    	o.afficher(g);
	    }
	    for(Ressource r : listRessources)
	    {
	    	r.afficher(g);
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
		 
		 if(SwingUtilities.isLeftMouseButton(e)) 
		 {
			 listObstacles.add(new Obstacle(x, y, SIZE, Color.blue));
			 paint(this.getGraphics());
		 }
		 else if(SwingUtilities.isRightMouseButton(e))
		 {
			 listRessources.add(new Ressource(x, y, SIZE, Color.red));
			 paint(this.getGraphics());
		 }
		
		 
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
}
