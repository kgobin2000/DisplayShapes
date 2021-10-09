import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Shape extends JPanel implements Comparable<Shape>{
	
	
	protected int l;
	protected int w;
	protected double area;
	protected Color color;

	public void draw() {
		// TODO Auto-generated method stub
	}

	public int compareTo(Shape other) {
		return (int) Math.round(this.area - other.area);	
	}
	
	@Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }

}
