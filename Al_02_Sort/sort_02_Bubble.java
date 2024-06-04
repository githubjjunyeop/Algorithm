package Al_02_Sort;

import java.util.Arrays;

public class sort_02_Bubble {
	
		static void bubble_Sort(int[] arr) {
			
			for(int i=0; i<arr.length; i++) {
				
				for(int j=0; j<arr.length; j++) {
					if(arr[i] <arr[j]) {
						
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
		}
		public static void main(String[] args) {
			int[] arr = {5,6,7,1,2,10,5,16,78,3,2};
			
			bubble_Sort(arr);
			System.out.println(Arrays.toString(arr));
		}

}
