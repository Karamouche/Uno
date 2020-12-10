package fr.karamouche.uno.menus;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame {
	private static final long serialVersionUID = 1L;

	public GameWindow(){
		this.setTitle("Uno");
		this.setSize(800, 400);
		
		JPanel pan = new JPanel();
		pan.setBackground(Color.getHSBColor(255, 245, 217));
		this.setContentPane(pan);
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
		this.setResizable(false);
		this.setVisible(true);
	}
}