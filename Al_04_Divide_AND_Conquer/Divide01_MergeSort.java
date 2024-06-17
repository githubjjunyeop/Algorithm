package Al_04_Divide_AND_Conquer;

public class Divide01_MergeSort  {
	 public static void merge(int[] array, int left, int mid, int right) {
	        // 두 개의 서브 배열 생성
	        int n1 = mid - left + 1;
	        int n2 = right - mid;
	        
	        int[] leftArray = new int[n1];
	        int[] rightArray = new int[n2];
	        
	        // 서브 배열에 데이터 복사
	        for (int i = 0; i < n1; i++) {
	            leftArray[i] = array[left + i];
	        }
	        for (int j = 0; j < n2; j++) {
	            rightArray[j] = array[mid + 1 + j];
	        }
	        
	        // 합병 과정
	        int i = 0, j = 0;
	        int k = left;
	        while (i < n1 && j < n2) {
	            if (leftArray[i] <= rightArray[j]) {
	                array[k] = leftArray[i];
	                i++;
	            } else {
	                array[k] = rightArray[j];
	                j++;
	            }
	            k++;
	        }
	        
	        // 남은 요소들 복사
	        while (i < n1) {
	            array[k] = leftArray[i];
	            i++;
	            k++;
	        }
	        
	        while (j < n2) {
	            array[k] = rightArray[j];
	            j++;
	            k++;
	        }
	    }
	 
	    // 병합 정렬 함수
	    public static void sort(int[] array, int left, int right) {
	        if (left < right) {
	            int mid = (left + right) / 2;
	            
	            // 왼쪽 절반 정렬
	            sort(array, left, mid);
	            // 오른쪽 절반 정렬
	            sort(array, mid + 1, right);
	            
	            // 정렬된 두 절반 합병
	            merge(array, left, mid, right);
	        }
	    }
	
		public static void main(String[] args) {
			 int[] array = {12, 11, 13, 5, 6, 7};
		        
		        System.out.println("Given Array");
		        printArray(array);
		        
		        sort(array, 0, array.length - 1);
		        
		        System.out.println("\nSorted array");
		        printArray(array);
		        
		        
			
		}
		  public static void printArray(int[] array) {
		        for (int i = 0; i < array.length; i++) {
		            System.out.print(array[i] + " ");
		        }
		        System.out.println();
		    }

}
