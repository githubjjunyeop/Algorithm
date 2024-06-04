package Al_02_Sort;

import java.util.Arrays;

public class sort_04_shell_sort {
	
		static void shell_sort (int[] arr) {
			
			  int n = arr.length;

		        // 초기 간격 설정 (n/2)
		        for (int gap = n / 2; gap > 0; gap /= 2) {
		            // 간격별로 삽입 정렬 수행
		            for (int i = gap; i < n; i += 1) {
		                int temp = arr[i];
		                int j;
		                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
		                    arr[j] = arr[j - gap];
		                }
		                arr[j] = temp;
		            }
		        }
			
		}
		public static void main(String[] args) {
			int[] arr = {5,6,7,1,2,10,5,16,78,3,2};
			
			shell_sort(arr);
			System.out.println(Arrays.toString(arr));
		}

}
