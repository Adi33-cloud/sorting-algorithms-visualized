package sortingVisulized;

import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class main extends JPanel  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr= new int [420];
//		main m = new main();
//		GUI display = new GUI();
//		m.fill(arr);
//		//display.start(arr);
//		SortingAlgorithms sa = new SortingAlgorithms();

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
			a.add(b); 
			b.fill();
			a.setVisible(true);
			b.InserstionSort();
			a.setVisible(false);
			
				break;
				
		case 2: 
			JFrame aa =new JFrame();
			main bb =new main();
			
			aa.setSize(1300,750);
			aa.setVisible(true);
			aa.setLocationRelativeTo(null);
			aa.add(bb); 
			bb.fill();
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
			bbb.fill();
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
			b_b.fill();
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
			b_bb.fill();
			a_aa.setVisible(true);

			b_bb.mergeSort(arr,0, arr.length-1);
			a_aa.setVisible(false);

			break;

		case 6: System.exit(0);
		
		}
	}
		
		
				 
		
}
	
	public void fill() {
		Random cell = new Random();
		for(int i=0; i<arr.length-1; i++) {
			arr[i]=cell.nextInt(700);
			
		}
		
	}
	public void QuickSort (int low, int high) {
		if(low>=high) {
			return;
		}
		int pivot= partition(low,high);
		QuickSort(low,pivot-1);
		QuickSort(pivot+1,high); 
		
	}
	
	public int partition(int low, int high) {
		int pivot= (low+high)/2;
		swap(pivot,high);
		
		int i=low;
		
		for(int j=low; j<high; j++) {
			if(arr[j]<=arr[high]) {
				swap(i,j);
				i++;
				}
		}
		swap(i,high);
		return i;
	}
	public void swap (int i, int j) {
	int temp = arr[i];
	arr[i]= arr[j];
	arr[j]=temp;
	 
	try {Thread.sleep(5);}catch (Exception ex) {}
	repaint();
	
	}
	
	
	public void mergeSort (int[] list, int lowIndex, int highIndex) {
		if (lowIndex == highIndex) {
			return;
		}
		else {
			int midIndex = (lowIndex + highIndex) / 2;
			mergeSort(list, lowIndex, midIndex);
			mergeSort(list, midIndex + 1, highIndex);
			merge(list, lowIndex, midIndex, highIndex);
		} 
	}

	public void merge(int[] list, int lowIndex, int midIndex, int highIndex) {
		
		int[] Left = new int[midIndex - lowIndex + 2];
		
		for (int i = lowIndex; i <= midIndex; i++) {
			Left[i - lowIndex] = list[i];
		}
		Left[midIndex - lowIndex + 1] = Integer.MAX_VALUE;// place holder for last element which never reaches
		int[] Right = new int[highIndex - midIndex + 1];
		
		for (int i = midIndex + 1; i <= highIndex; i++) {
			Right[i - midIndex - 1] = list[i];
		}
		Right[highIndex - midIndex] = Integer.MAX_VALUE;//  place holder for last element which never reaches
		int i = 0, j = 0;
		
		for (int k = lowIndex; k <= highIndex; k++) {
			if (Left[i] <= Right[j]) {
				list[k] = Left[i];
				i++;
			}
			else {
				list[k] = Right[j];
				j++;
			}
			try {Thread.sleep(5);}catch (Exception ex) {}
			repaint();
			
			
		} 
		
	}

		
	public void BubbleSort(){
		int i,j,temp=0;
		for(i=0; i<arr.length-1; i++) {
			for(j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
				try {Thread.sleep(1);}catch (Exception ex) {}
				repaint();
				
			}
			
			
		}
		
	}
	
	public void SelectionSort() {
		int i,j, minValue, minIndex,temp=0;
		
		for(i=0; i<arr.length; i++) {
			minValue= arr[i];
			minIndex=i;
			for(j=i+1; j<arr.length; j++) {
				if(arr[j]< minValue) {
					minValue = arr[j];
					minIndex = j; 
				}
				
			}
			if(minValue<arr[i]) {
				temp=arr[i];
				arr[i]= arr[minIndex];
				arr[minIndex]=temp;
			}
			try {Thread.sleep(50);}catch (Exception ex) {}
			repaint();

		}
	}
	
	public void InserstionSort() {
		int i,j,key,temp;
		
		for(i=1; i<arr.length; i++) {
			key = arr[i];
			j = i-1;
			while(j>=0 && key<arr[j]) {
				temp = arr[j];
				arr[j]= arr[j+1];
				arr[j+1]= temp;
				j--;
				
			}
			try {Thread.sleep(50);}catch (Exception ex) {}
			repaint();
		}

	}
	

	static int[] arr= new int [420];
	int xloc = 10, yloc = 700, width = 2;
	int a=0;


	public void paintComponent(Graphics g) {
	super.paintComponent(g);
	draw(g);

}

	public void draw(Graphics g) {
	
		for(int i =0; i<arr.length; i++) {
			xloc += width+1;
			g.fillRect(xloc, yloc-arr[i] , width, arr[i]);
			
		}
		xloc=10;
	}	
}
	
	