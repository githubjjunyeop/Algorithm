package Al_02_Sort;

import java.util.Arrays;

public class sort_05_Merge_sort {
	 public static void mergeSort(int[] arr) {
	        if (arr.length > 1) {
	            int mid = arr.length / 2;
	            int[] left = new int[mid];
	            int[] right = new int[arr.length - mid];

	            // 왼쪽 부분 배열 만들기
	            for (int i = 0; i < mid; i++) {
	                left[i] = arr[i];
	            }

	            // 오른쪽 부분 배열 만들기
	            for (int i = mid; i < arr.length; i++) {
	                right[i - mid] = arr[i];
	            }

	            // 왼쪽 부분 배열 정렬
	            mergeSort(left);
	            // 오른쪽 부분 배열 정렬
	            mergeSort(right);

	            // 정렬된 왼쪽, 오른쪽 부분 배열 병합
	            merge(arr, left, right);
	        }
	    }

	    private static void merge(int[] arr, int[] left, int[] right) {
	        int i = 0, j = 0, k = 0;

	        // 왼쪽, 오른쪽 부분 배열 비교하며 병합
	        while (i < left.length && j < right.length) {
	            if (left[i] <= right[j]) {
	                arr[k++] = left[i++];
	            } else {
	                arr[k++] = right[j++];
	            }
	        }

	        // 남은 요소 처리
	        while (i < left.length) {
	            arr[k++] = left[i++];
	        }
	        while (j < right.length) {
	            arr[k++] = right[j++];
	        }
	    }
		public static void main(String[] args) {
			int[] arr = {5,6,7,1,2,10,5,16,78,3,2};
			
			mergeSort(arr);
			System.out.println(Arrays.toString(arr));
		}

}
