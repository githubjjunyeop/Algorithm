package Al_02_Sort;

import java.util.Arrays;

public class sort_08_Radix_Sort {
	
	  // arr[]에서 최대값을 구하는 유틸리티 함수
    static int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    // exp로 표현된 자리수에 따라 arr[]의 카운팅 정렬을 수행하는 함수
    static void countSort(int arr[], int n, int exp) {
        int output[] = new int[n]; // 출력 배열
        int i;
        int count[] = new int[10];
        // count 배열을 0으로 초기화
        for (i = 0; i < 10; i++)
            count[i] = 0;

        // count[]에 각 자리수의 개수를 저장
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        // count[i]를 변경하여 실제 출력 위치를 저장
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // 출력 배열을 빌드
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // output 배열을 arr[]에 복사하여 현재 자리수에 따라 정렬된 결과를 저장
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // Radix Sort를 사용하여 크기 n의 arr[]을 정렬하는 메인 함수
    static void radixsort(int arr[], int n) {
        // 자리수를 알기 위해 최대값을 찾기
        int m = getMax(arr, n);
        System.out.println("최댓수 : " + m);
        
        // 모든 자리수에 대해 카운팅 정렬 수행
        // 자리수 번호 대신 exp(10^i)를 전달
        // i는 현재 자리수를 의미
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }

    // 배열을 출력하는 유틸리티 함수
    static void print(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
		public static void main(String[] args) {
			 int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
		        int n = arr.length;
		        radixsort(arr, n);
		        print(arr, n);
		}

}
