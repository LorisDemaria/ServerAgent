package gui;
import Server.CEnvironement;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class ServerGui extends JFrame {

	
	public ServerGui() {
		
	CEnvironement environnement = new CEnvironement(400,400);
	setSize(400, 400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	add(environnement);
	setVisible(true);
	
	}
}
