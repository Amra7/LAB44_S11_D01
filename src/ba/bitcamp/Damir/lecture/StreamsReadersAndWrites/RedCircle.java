package ba.bitcamp.Damir.lecture.StreamsReadersAndWrites;

import java.awt.Color;
import java.awt.Graphics;

public class RedCircle extends Circle {

	public RedCircle(Graphics g) {
		super(g);

	}
	@Override
	public void drawAt(int x, int y){
		Color prevousColor  = g.getColor();
		g.setColor(Color.RED);
		super.drawAt(x, y);
		g.setColor(prevousColor);
	}

}
