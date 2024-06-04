package Al_02_Sort;

import java.util.Arrays;

public class sort_03_insertion_sort {
	
		static void insertion_Sort (int[] arr) {
			
			// int[] arr = {5,6,7,1,2,10,5,16,78,3,2};
			for(int i=1; i<arr.length; i++) {
				int key = arr[i];
				int j = i-1;
				
				while(j >=0 && arr[j] >key) {
				arr[j+1] = arr[j];
				j--;
				}
				arr[j+1] = key;
			}
			
		}
		public static void main(String[] args) {
			int[] arr = {5,6,7,1,2,10,5,16,78,3,2};
			
			insertion_Sort(arr);
			System.out.println(Arrays.toString(arr));
		}

}
