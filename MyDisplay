package fr.dauphine.ja.CelinaIdir.shapes.view;
import java.awt.*;
import javax.swing.JPanel;

import fr.dauphine.ja.CelinaIdir.shapes.model.Model;

import javax.swing.JFrame;
import java.awt.Graphics;

public class MyDisplay extends JPanel {


	private Model m;


	public void drawing() {
		repaint();
	}
	

	@SuppressWarnings("static-access")
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		for(int i=0; i < m.shapes.size(); i++) {
			m.shapes.get(i).draw(g);
		}
	}
	
	public void drawLine(Graphics g) {
	     g.drawLine(120, 50, 360, 50);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JFrame fr = new JFrame("");
		//fr.getContentPane().add(this); 
		 


		
		JFrame frame = new JFrame("Java Avancée - Graphic Display");
		 frame.setSize(new Dimension(500,500)); //définie la taille de la fenêtre
		 frame.setVisible(true); // rends la fenêtre visible
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		 MyDisplay d = new MyDisplay();
		 frame.add(d);

	}

}

