package Al_02_Sort;

import java.util.Arrays;

public class sort_09_Counting_Sort {
	
	  // 계수 정렬 함수
    public static void countingSort(int[] arr) {
        int n = arr.length;

        // 출력 배열(output)을 생성하고 초기화
        int[] output = new int[n];

        // arr[] 내의 최대값을 찾기 위한 범위 계산
        int max = getMax(arr);

        // 카운트 배열(count)을 생성하고 초기화
        int[] count = new int[max + 1];

        // 각 원소의 개수를 count 배열에 저장
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // count 배열을 수정하여 실제 위치 저장
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // 출력 배열을 빌드
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // output 배열의 원소를 arr[]로 복사하여 정렬 결과 저장
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // arr[]에서 최대값을 구하는 유틸리티 함수
     static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // 배열을 출력하는 유틸리티 함수
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
		public static void main(String[] args) {
			  int[] arr = { 4, 2, 2, 8, 3, 3, 1 };
		        System.out.println("정렬 전 배열:");
		        printArray(arr);

		        countingSort(arr);

		        System.out.println("정렬 후 배열:");
		        printArray(arr);
		        
		}

}
