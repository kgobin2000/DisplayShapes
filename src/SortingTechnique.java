import java.util.Arrays;

import javax.swing.JLabel;

public class SortingTechnique {
	public SortingTechnique(Shape shapes[]) {
		 for (int i = 0; i < shapes.length - 1; i++)  {  
	            int index = i;  
	            for (int j = i + 1; j < shapes.length; j++){  
	                if (shapes[j].compareTo(shapes[index]) < 1){  
	                    index = j;
	                }  
	            }  
	            Shape smallerShape = shapes[index];   
	            shapes[index] = shapes[i];  
	            shapes[i] = smallerShape;  
	        }  
	    }  
}

