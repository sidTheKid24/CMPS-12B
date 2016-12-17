public class selectionSort {
	// This is the main method
	public static void main(String[] args){
		// this is an unsorted array
		int[] array = {6,3,8,4,9,7,1,2,5};
		// runs selection sort on unsorted array
		selectionSort(array);
		// print out the array
		printArray(array);
	}
	// this method is for selection sort
	public static void selectionSort (int[] array){
		int i, j, temp;  
		for (i = 0; i < array.length - 1; i ++){
			int first = i;
			//System.out.println(j);
			for(j = i + 1; j < array.length; j ++){
				//System.out.println(i);
				if( array[j] < array[i] ){
					first = j;
				}
			}
			if(i != first){
				temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}           
	}
	// this method is for bubble sort
	public static void bubbleSort(int[] array){
		int bottom = array.length - 1;
		for(int top = 0; top < bottom; top++){
			for(int i = bottom; i > top; i--){
				if(array[i] < array[i - 1]){
					int temp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = temp;
				}
			}
		}
	}
	// this method prints out the array passed to it
	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i ++){
			System.out.print(array[i] + " ");
		}
	}
}
