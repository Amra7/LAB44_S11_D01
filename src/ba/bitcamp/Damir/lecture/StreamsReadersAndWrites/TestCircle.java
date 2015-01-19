package ba.bitcamp.Damir.lecture.StreamsReadersAndWrites;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestCircle {

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Circle");
		window.setSize(500, 500);
		
		Draw panel = new Draw();
		window.setContentPane(panel);
		
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static class Draw extends JPanel{
		int x= 100;
		int y = 100;
		
		Circle c;
		RedCircle rc;
		CrosedCircle cc;
		
		public void paintComponent( Graphics g){
			super.paintComponent(g);
			
			c = new Circle(g);
			c.drawAt(x+x/2, y+y/2);
			
			rc = new RedCircle(g);
			rc.drawAt(x+x, y+y);
			
			cc =  new CrosedCircle(g);
			cc.drawAt(x,y);
			
		}
	}

}
