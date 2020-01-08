package packAB;

//public class 실험소 {

//	public static void main(String[] args) {
//		int inResult = 0;
//		int inLimt = 1000;
//		for ( int i = inLimt; i > 0; )
//		{
//			i--;
//			
//			for ( int j = inLimt; j > 0; )
//			{
//				j--;
//				
//				int inNum = i*j;
//				
//				String stNum = String.valueOf(inNum);
//				int inLength = stNum.length();
//				if ( stNum.length()%2 == 0)
//				{
//					boolean blFlag = false;
//					
//					for ( int k = 0; k < inLength/2; k++)
//					{
//						if ( stNum.charAt(k) != stNum.charAt( inLength-(k+1)))
//						{
//							blFlag = true;
//							break;
//						}
//					}
//					
//					if ( !blFlag)
//					{
//						if ( inResult < inNum)
//						{
//							inResult = inNum;
//						}
//					}
//				}
//			}
//			
//		}
//		
//		System.out.println( "RESULT : " + inResult);
//		int k=1;
//		do {
//			System.out.println("k"+k); 
//			k--;
//			if(k<1) {
//			 break;
//			}
//		}while(k<1);
//
//		double a = 0.1;
//		double b = 0.1;
//		double c = a*b;
//		System.out.println("c"+c);
		
		class SuperObject {

			public void paint() {
				System.out.println("superPaint");
				draw();
			} 
			public void draw() {
				draw();
				System.out.println("super");
			}
			}

			class SubObject extends SuperObject{
			public void paint() {
				System.out.println("subpaint");
				super.draw();
			} 
			
			public void draw() {
				System.out.println("sub");
			}
			
			}

				public class 실험소 {
					public static void main(String[] args) {

						SuperObject b = new SubObject();
						b.paint();
			}
			}
		
		
//	}

//}
