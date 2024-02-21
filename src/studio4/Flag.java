package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.3);
		
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledRectangle(0.5, 0.5, 0.48, 0.28);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.7, 0.65, 0.1);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(0.7, 0.65, 0.05);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.3, 0.65, 0.1);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(0.3, 0.65, 0.05);
		
		StdDraw.setPenColor(144, 238, 144);
		StdDraw.filledRectangle(0.5, 0.4, 0.48, 0.09);
		StdDraw.setPenColor(195,177,225);
		StdDraw.filledRectangle(0.5, 0.4, 0.48, 0.065);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(0.5, 0.55, 0.03);
		
		StdDraw.setPenColor(255, 204, 203);
		StdDraw.filledCircle(0.5, 0.55, 0.01);
		
	}
}