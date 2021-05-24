package sortingVisulized;

public class SortingAlgorithms {
	
	Paint p = new Paint();
	
	public void inserstionSort(int[] arr) {
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
			p.repaint();
		}
	}
	
	private void selectionSort(int[] arr) {
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
			p.repaint();

		}
	}
	
	private void bubbleSort(int[] arr){
		int i,j,temp=0;
		for(i=0; i<arr.length-1; i++) {
			for(j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
				try {Thread.sleep(1);}catch (Exception ex) {}
				p.repaint();
				
			}
		}
	}
	
	private void mergeSort (int[] list, int lowIndex, int highIndex) {
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

	private void merge(int[] list, int lowIndex, int midIndex, int highIndex) {
		
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
			p.repaint();	
		} 
	}
	
	private void quickSort (int low, int high, int[] arr) {
		if(low>=high) {
			return;
		}
		int pivot= partition(low,high, arr);
		quickSort(low,pivot-1, arr);
		quickSort(pivot+1,high, arr); 
		
	}
	
	public int partition(int low, int high, int[] arr) {
		int pivot= (low+high)/2;
		swap(pivot,high,arr);
		
		int i=low;
		
		for(int j=low; j<high; j++) {
			if(arr[j]<=arr[high]) {
				swap(i,j, arr);
				i++;
				}
		}
		swap(i,high, arr);
		return i;
	}
	public void swap (int i, int j, int[] arr) {
	int temp = arr[i];
	arr[i]= arr[j];
	arr[j]=temp;
	 
	try {Thread.sleep(5);}catch (Exception ex) {}
	p.repaint();
	
	}

}
