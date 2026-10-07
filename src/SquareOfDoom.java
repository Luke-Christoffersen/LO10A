import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class SquareOfDoom {
	// INstance variables
	private static final int BOX_DIMENSION = 150;
	// Draw class for SoD
	public void draw(Graphics g, int SoDX, int SoDY) {
		// Create the graphics object
		Graphics2D g2 = (Graphics2D) g;
		
		// Create the x and y locations for the square
		int x = SoDX;
		int y = SoDY;
		
		// Set the color of the square to red
		g2.setColor(Color.black);
		
		// Draw the SoD
		g2.fillRect(x, y, BOX_DIMENSION, BOX_DIMENSION);
		
		// Add words to the drawing
		g2.setColor(Color.red);
		g2.drawString("DOOM", x + 10,y + 10);
	}
}
