package fr.dauphine.ja.CelinaIdir.shapes.model;

import java.awt.Graphics;
import java.awt.Point;

public class Circle {
	
	private Point p;
    private int radius;

    public Circle(){}

    public Circle(Point p,int r){
        this.p = p;
        this.radius = r;
    }
    public int getRadius(){
        return this.radius;
    }
    public Point getP(){
        return p;
    }

    public String toString(){
        String s;
        s = "Le centre du cercle est le point "+ this.p.toString() + "et a un rayon de "+ this.radius;
        return s;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
