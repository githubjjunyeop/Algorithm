package Al_01_recursive;

import java.util.ArrayList;

public class recursive_02_AllCards {
	
		static ArrayList<String> AllCards(char[] arr){
			ArrayList<String> Cards = new ArrayList<String>();
			
			return Cards;
		}
	
		public static void main(String[] args) {
			// 예를들어  7, 5 ,1 ,2 가 적힌 카드가 있스비다 (총4장)
			// 이 카드를 조합해서 모든 경우의 수를 다 찾아보세요
			// ex 7512, 7521, 7152 , 7125, 7215, 7251 , 2157
			// 모든 카드조합이 담겨져 있는 배열을 리턴시오.
			// String배열, Integer 배열 둘다 구현하시오
			
			ArrayList<String> Cards = new ArrayList<String>();
			
			char[] numbers = {7,5,1,2};
			
			Cards =  AllCards(numbers);
			Cards.add("7512");
			System.out.println(Cards);
		}
}
