package Al_03_Search;

public class search_02_Binary_Search {
	
	static int Binary_Search(int[] arr , int n,int low,int high) {
		
		if(low > high) {
			return -1;
		}
		int middle = (low + high) / 2;
		
		
		if(arr[middle] ==  n) {
			return middle;
		} else if(arr[middle]  > n) {
			return Binary_Search(arr,n,low,middle-1);
		} else {
			return Binary_Search(arr,n,middle+1,high);
		} 
		
		
	}
	
	
	public static void main(String[] args) {
		// arr 배열중에 숫자 3이 들어 갔는지 탐색하시오. (이진 탐색) -> n 숫자의 인덱스 위치를 구하시오
		int n = 3;
		int[] arr = {2,3,4,4,6,8,9,123};
		System.out.println(Binary_Search(arr, n,0, arr.length-1));
		
	} 
}
