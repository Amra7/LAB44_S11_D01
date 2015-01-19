package ba.bitcamp.Damir.lecture.StreamsReadersAndWrites;

import java.awt.Graphics;

public class Circle {
	
	protected int size=50;
	protected Graphics g;
	
	public Circle(Graphics g) {
		this.g = g;
	}
	
	public void drawAt( int x, int y){
		g.fillOval(x - size/2, y - size/2, size, size);
	}

}
     