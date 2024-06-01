package Al_01_recursive;

public class 연습 {
		 public static void main(String[] args) {
			 char[] arr = {'a','b','c','d'};
			 int count =0;
			 for(int i = 0; i < arr.length; i++){
			        // for j : 두번째 index에 위치
			        for(int j = 0; j < arr.length; j++){
			            // i 와 중복되면 안되니까 i == j 라면 스킵.
			            if(i == j) continue;
			            // for k : 세번째 index에 위치
			            for(int k = 0; k < arr.length; k++){
			                if(i == k) continue;
			                if(j == k) continue;
			                
			                for(int m =0; m<arr.length; m++) {
			                if(i == m) continue;
			                if(j == m) continue;
			                if(k == m) continue;
			                
			                System.out.println(arr[i] + " " +  arr[j] + " " +  arr[k] + " " + arr[m]);
			                count++;
			                }
			            }
			        }
			    }
			 System.out.println(count);
		}

}
