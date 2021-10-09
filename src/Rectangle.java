import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

public class Rectangle extends Shape{
	

	@Override
	public void draw(){

		Random rand = new Random();
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		Color randomColor = new Color(r, g, b);
		this.color = randomColor;

		this.l = (int) (40 * Math.random() * 0.5 + 0.5) ; 
		this.w = (int) (40 * Math.random() * 0.5 + 0.5) ;
		this.area = this.l * this.w;
		repaint();		
	}
	

	public void paintComponent(Graphics g) {
		//System.out.println("RUNNING PAINT");
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;	
		g2d.setColor(this.color);  
		g2d.fillRect(0, 0, this.l, this.w); 
	 }

}
