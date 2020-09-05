package entities;

import java.awt.geom.Point2D;

/* TODO: check if generic class/interface is possible (example: Double or Float)
 * 
 */
public interface MovableCursor {
	void moveCursor();
	
	Point2D getPosition();
}
