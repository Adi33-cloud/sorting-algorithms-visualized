package sortingVisulized;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Paint extends JPanel {
	
	private int xloc = 10, yloc = 700, width = 2;
	
	public void paintComponent(Graphics g, int[] arr) {
		super.paintComponent(g);
		draw(g, arr);

	}

		public void draw(Graphics g, int[] arr) {
		
			for(int i =0; i<arr.length; i++) {
				xloc += width+1;
				g.fillRect(xloc, yloc-arr[i] , width, arr[i]);
				
			}
			xloc=10;
			
			
		}	


}
