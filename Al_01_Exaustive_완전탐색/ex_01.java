package Al_01_Exaustive_완전탐색;

import java.util.Arrays;
import java.util.Random;

public class ex_01 {
	
	public static int[] setNum(int min , int max , int[] arr) {
		
		Random ran = new Random(); 
		for(int i=0; i<arr.length; i++) {
				arr[i] = ran.nextInt((max-min)+1)+min;
		
		}
		
		return arr;
	}
	
		public static int[] ranNum(int min , int max , int[] arr) {
			
			if(min == 0) {
				for(int i=0; i<arr.length; i++) {
					arr[i] = -1;
				}
			}
			
			Random ran = new Random(); 
			for(int i=0; i<arr.length; i++) {
				boolean check = false;
				int r = ran.nextInt((max-min)+1)+min;
				System.out.print(r +  " ");
				for(int j=0; j<arr.length; j++) {
					if(r == arr[j]) {
						check = true;
					}
				}
				
				if(check == false) {
					arr[i] = r;
				} else {
					i--;
				}
			}
			
			return arr;
		}
		
		public static String baby_gin(int[] arr,int length){
			String result = "baby-gin이 아닙니다.";
			
			int[] test = new int[length+1];
			
			for(int i=0; i<arr.length; i++) {
				test[arr[i]]++;
			}
			
			int count = 0;
			int run = -1;
			int triplet = 0;
			
			boolean check = true;
			for(int i=0; i<test.length; i++) {
				if(test[i]>=3) {
					triplet++;
				}
				
				if(test[i]>=1) {
					count++;
				} else {
					count = 0;
				}
				
				if(count >=3) {
					run = 1;
				}
			}
			
			if(triplet ==2) {
				result = "baby-gin";
			} else if(run == 1 && triplet >=1) {
				result = "baby-gin";
			}
			
			return result;
		}
		public static void main(String[] args) {
			// 0~9 사이의 숫자 카드에서 임의의 카드 6장을 뽑았을 때  3장의 카드가 연속적인
			// 번호를 갖는 경우를 run이라 하고, 3장의 카드가 동일한 번호를 갖는 경우를 triplet 이라고 함
			// 6장의 카드가 run과 triplet로만 구성된 경우를 baby-gin이라 함 
			
			int[] cards =  new int[6];
			
			int[] result = setNum(0,9,cards);
			
			System.out.println(Arrays.toString(result));

			System.out.println(baby_gin(result,9));
		}
		
		

}
