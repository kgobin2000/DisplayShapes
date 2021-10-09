import javax.swing.JPanel;

public class ShapeFactory extends JPanel {
	//use getShape method to get object of type shape
	
	public Shape getShape(){ 
		double random = Math.random();
		if (random < 0.33) 
			return new Rectangle();
		else if (random >= 0.33 && random < 0.66)
			return new Square();
		else if (random >= 0.66 && random <= 1)
			return new Circle();
		return null;	
	}
}
