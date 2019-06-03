package gui;
import Server.CEnvironement;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;


public class ServerGui extends JFrame{

	CEnvironement environnement;
	public ServerGui() 
	{
		environnement = new CEnvironement(400,400);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(environnement);
		setVisible(true);
	}

	
}
