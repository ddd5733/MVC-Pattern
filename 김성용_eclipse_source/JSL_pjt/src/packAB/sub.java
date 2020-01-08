package packAB;

import java.util.ArrayList;
import java.util.Random;

import packC.C;

public class sub {
	void test() {
		String a ="aaWW";
		if(a.equalsIgnoreCase("AAww")) System.out.println("같드아");
		if(a.equals("Y")) System.out.println("같다");
		
		ArrayList<String> arr = new ArrayList();
		if(arr.size()==0) System.out.println("없다111111111"+arr.size());
		if(arr.isEmpty()) System.out.println("없다222222222"+arr.isEmpty());
		
		
		for(int k=0; k<4; k++) {
			for(int j=0; j<5; j++) {
				if(j==3) return;	
				System.out.println("  j  "+j);
			}
			System.out.println("  test()  "+k);
		}
//		C cc = new C();
//		String name = cc.getName();
//		System.out.println("name" + name);
//		String a = "1908_0002";
//		System.out.println("a.0.4        //"+a.substring(4));


		 

	
	
	}
}

