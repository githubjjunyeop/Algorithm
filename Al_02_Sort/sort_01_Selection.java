package Al_02_Sort;

import java.util.Arrays;

/*선택 정렬(Selection Sort)
 
  
 */
public class sort_01_Selection {
	
	static void select_sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int min = arr[i];
			int min_index = i;
			for(int j=i; j<arr.length; j++) {
				if(min > arr[j]) {
					min = arr[j];
					min_index = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
			
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {5,6,7,1,2,10,5,16,78,3,2};
		select_sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
