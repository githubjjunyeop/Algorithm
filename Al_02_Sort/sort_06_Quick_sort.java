package Al_02_Sort;

import java.util.Arrays;

public class sort_06_Quick_sort {
	public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // 피벗을 기준으로 분할
            int pivotIndex = partition(array, low, high);
            
            // 피벗을 제외한 좌측 부분 배열 정렬
            quickSort(array, low, pivotIndex - 1);
            
            // 피벗을 제외한 우측 부분 배열 정렬
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // 피벗으로 배열의 마지막 요소 선택
        int i = low - 1; // 피벗보다 작은 값들의 마지막 인덱스

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j); // 작은 값들을 피벗의 좌측으로 이동
            }
        }

        swap(array, i + 1, high); // 피벗을 정렬된 위치로 이동
        return i + 1; // 피벗의 인덱스 반환
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
		public static void main(String[] args) {
			int[] array = {5, 9, 1, 3, 7, 6, 4, 8, 2};
	        int n = array.length;

	        System.out.println("정렬 이전 배열: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(array[i] + " ");
	        }

	        quickSort(array, 0, n - 1);

	        System.out.println("\n정렬된 배열: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(array[i] + " ");
	        }
		}

}
