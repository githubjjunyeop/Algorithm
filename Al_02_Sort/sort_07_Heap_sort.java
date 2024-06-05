package Al_02_Sort;

import java.util.Arrays;

public class sort_07_Heap_sort {
	
	public static void Heap_sort(int[] array) {
        int n = array.length;

        // 최대 힙 구성
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // 힙 정렬 수행
        for (int i = n - 1; i >= 0; i--) {
            // 최대 힙의 루트(최대값)와 마지막 노드 교환
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // 힙 크기를 줄여 정렬되지 않은 부분 다시 최대 힙 구성
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int n, int i) {
        int largest = i; // 부모 노드
        int leftChild = 2 * i + 1; // 왼쪽 자식 노드
        int rightChild = 2 * i + 2; // 오른쪽 자식 노드

        // 왼쪽 자식이 부모보다 큰 경우
        if (leftChild < n && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        // 오른쪽 자식이 부모나 왼쪽 자식보다 큰 경우
        if (rightChild < n && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        // 부모가 자식보다 작지 않은 경우
        if (largest != i) {
            // 부모와 가장 큰 자식 교환
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            // 교환된 자식을 기준으로 재귀적으로 최대 힙 구성
            heapify(array, n, largest);
        }
    }

   
		public static void main(String[] args) {
			int[] array = {12, 11, 13, 5, 6, 7};
	        int n = array.length;

	        System.out.println("정렬 이전 배열: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(array[i] + " ");
	        }

	        Heap_sort(array);

	        System.out.println("\n정렬된 배열: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(array[i] + " ");
	        }
		}

}
