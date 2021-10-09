import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

public class Square extends Shape{
	
	@Override
	public void draw(){
		
		Random rand = new Random();
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		Color randomColor = new Color(r, g, b);
		this.color = randomColor;
	
	    double newRandom = Math.random()* 0.5 + 0.5; //generate a random number between 0.5 and 1
		this.l = (int) (40 * newRandom); //multiply number by dimension to calculate size
		this.w = this.l;
		this.area = this.l * this.l;
		repaint();
	}
	 
	
	public void paintComponent(Graphics g) {
		//System.out.println("RUNNING Square PAINT");
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;	
		g2d.setColor(this.color);  
		g2d.fillRect(0, 0, this.l, this.l );
	 }


}
