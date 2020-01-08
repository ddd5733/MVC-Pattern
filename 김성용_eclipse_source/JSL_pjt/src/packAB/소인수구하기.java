package packAB;

import java.util.ArrayList;

public class 소인수구하기 {

	public static void main(String[] args) {
		long a = 600851475143l;
	ArrayList<Integer> array = new ArrayList<Integer>();
	int b=2;
	int c =0;
	while(true) {
			if(a%b==0) { 
				a=a/b;
				c=b;
			} else {
				b++;
			}
		if(b>a) break;	
	}
	
	System.out.println("ddd"+c);
	
	
	
	
		
	}

}
