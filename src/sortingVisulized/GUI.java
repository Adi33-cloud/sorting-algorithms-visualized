package sortingVisulized;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI extends JPanel {
	
//	private int[] arr;
//	private JFrame a;
	private SortingAlgorithms sa = new SortingAlgorithms();
//	
//	GUI(int[] arr){
//		this.arr = arr;
//		a = new JFrame();
//		sa = new SortingAlgorithms();
//	}

	
	public void start(int[] arr) {
		while(true){
			//String output = " ";
			String input= JOptionPane.showInputDialog("\n Please choose an option"
			+ "\n 1. Inserstion Sort"
			+ "\n 2. Selection Sort"
			+ "\n 3. Bubble Sort"
			+"\n 4. Quick Sort"
			+"\n 5. Merge Sort"
			+"\n 6. Exit");
			
			int in= Integer.parseInt(input);
					
			switch(in) {
			
			
			case 1: 
				JFrame a =new JFrame();
				main b =new main();
				
				a.setSize(1300,750);
				a.setVisible(true);
				a.setLocationRelativeTo(null);
				//a.add(b);
				a.add(b);
				//b.fill();
				a.setVisible(true);

				
				//b.InserstionSort();
				sa.inserstionSort(arr);
				a.setVisible(false);
				
					break;
					
			case 2: 
				JFrame aa =new JFrame();
				main bb =new main();
				
				aa.setSize(1300,750);
				aa.setVisible(true);
				aa.setLocationRelativeTo(null);
				aa.add(bb); 
				//bb.fill();
				aa.setVisible(true);

				
				bb.SelectionSort();
				aa.setVisible(false);

			
					break;
			
			case 3: 
				JFrame aaa =new JFrame();
				main bbb =new main();
				aaa.setSize(1300,750);
				aaa.setVisible(true);
				aaa.setLocationRelativeTo(null);
				aaa.add(bbb); 
				//bbb.fill();
				aaa.setVisible(true);

				
				bbb.BubbleSort();
				aaa.setVisible(false);

				
					break;
			
			case 4: 
				JFrame a_a =new JFrame();
				main b_b =new main();
				
				a_a.setSize(1300,750);
				a_a.setVisible(true);
				a_a.setLocationRelativeTo(null);
				a_a.add(b_b); 
				//b_b.fill();
				a_a.setVisible(true);

				
				b_b.QuickSort(0, arr.length-1);
				a_a.setVisible(false);

				break;
				
			case 5:
				JFrame a_aa =new JFrame();
				main b_bb =new main();
				
				a_aa.setSize(1300,750);
				a_aa.setVisible(true);
				a_aa.setLocationRelativeTo(null);
				a_aa.add(b_bb); 
				//b_bb.fill();
				a_aa.setVisible(true);

				b_bb.mergeSort(arr,0, arr.length-1);
				a_aa.setVisible(false);

				break;
			
			case 6: System.exit(0);
			
			}
		}
			
	}

}
