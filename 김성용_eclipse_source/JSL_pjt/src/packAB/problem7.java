package packAB;

import java.util.Arrays;
import java.util.Scanner;

public class problem7 {

	public static void main(String[] args) {
//		소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, ... 과 같이 됩니다.
//		이 때 10,001번째의 소수를 구하세요
		int j =2;
		int count = 0;
		int p =1;
		while(true) {
			p++;
				for(j=2; j<=p; j++) {
					if(p==j) {
						count++;
					} else if(p%j==0){
						break;
					}
				}
			
					
				if(count==10001) break;
		 }
			System.out.println(p);
		
	
		
		
	

		}
	}
