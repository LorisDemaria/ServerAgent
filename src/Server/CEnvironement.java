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
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CEnvironement extends Canvas implements MouseListener {
	
	private List<Ressource> listRessource;
	private boolean[][] listObstacle;
	
	
	public CEnvironement(int h, int l) 
	{
		super();
		setSize(l,h);		
		setBackground(Color.BLACK);
	    setVisible(true);
	    addMouseListener(this);
	    listObstacle = new boolean[h][l];
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	public void paint(Graphics g,int x,int y) {
	    g.fillRect(x-5,y-5,10,10);
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
		// TODO Auto-generated method stub
		//System.out.println("aaaaaé");	
		 int x=e.getX();
		 int y=e.getY();
		 //System.out.println(y);
		 
		 paint(this.getGraphics(),x,y);
		 listObstacle[x][y]=true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
