package fr.dauphine.ja.CelinaIdir.shapes.Controller;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import fr.dauphine.ja.CelinaIdir.shapes.model.Model;
import fr.dauphine.ja.CelinaIdir.shapes.view.MyDisplay;

public class Controller implements MouseMotionListener {
	Model m;
	MyDisplay mD;
	
	public Controller() {
		mD.addMouseMotionListener(this);
	}
	

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub 
		List<Circle> shapes = m.shapes;
		Circle c = shapes.get(shapes.size()-1);
		if(c.Contain(new Point(e.getX(),e.getY)));
		m.add(new Circle(new Point(e.getX(),e.getY()),c.getR())); // c.getR() pour récupérer le rayon du cercle
		mD.drawing(); */
	}


	@Override
	public void mouseDragged(MouseEvent e) {}
	@Override
	public void mouseMoved(MouseEvent e) {}

}
