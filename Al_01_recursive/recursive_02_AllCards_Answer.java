package Al_01_recursive;

import java.util.ArrayList;
import java.util.Arrays;

public class recursive_02_AllCards_Answer {
	
	static  ArrayList<String> Allcards(String arr){
		
		ArrayList<String> cards = new ArrayList<String>();
	    // for i : 첫번째 index에 위치
	    for(int i = 0; i < arr.length(); i++){
	        // for j : 두번째 index에 위치
	        for(int j = 0; j < arr.length(); j++){
	            // i 와 중복되면 안되니까 i == j 라면 스킵.
	            if(i == j) continue;
	            // for k : 세번째 index에 위치
	            for(int k = 0; k < arr.length(); k++){
	                if(i == k) continue;
	                if(j == k) continue;
	                
	                cards.add(arr.charAt(i)  + ""+ arr.charAt(j) +"" +  arr.charAt(k));

	            }
	        }
	    }
	    
	    return cards;
	}
    
    public static void main(String[] args) {
    	 	String numbers = "abcd";
    	    ArrayList<String> cards = new ArrayList<String>();
    	    cards = Allcards(numbers);
    	    System.out.println(cards.size());
    	    for (String card : cards) {
    	        System.out.println(card);
    	    }
    }
}
