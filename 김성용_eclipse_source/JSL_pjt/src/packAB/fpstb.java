package packAB;

import java.util.ArrayList;

public class fpstb {

	public static void main(String[] args) {
		sub sub = new sub();
		sub.test();
		
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
	}

}
