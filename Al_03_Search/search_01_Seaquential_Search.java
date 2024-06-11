package Al_03_Search;

public class search_01_Seaquential_Search {
	
	static int Seaquential_Search(int[] arr , int n) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == n) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// arr 배열중에 숫자 3이 들어 갔는지 탐색하시오. (순차 탐색) -> n 숫자의 인덱스 위치를 구하시오
		int n = 3;
		int[] arr = {123,4,8,2,6,4,9,3};
		System.out.println(Seaquential_Search(arr,n));
	} 
}
