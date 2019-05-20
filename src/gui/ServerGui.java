package gui;
import Server.Terrain;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class ServerGui extends JFrame {

	
	public ServerGui() {
		
	Terrain environnement = new Terrain(600,300);
	setSize(400, 400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	add(environnement);
	setVisible(true);
	
	}
}
