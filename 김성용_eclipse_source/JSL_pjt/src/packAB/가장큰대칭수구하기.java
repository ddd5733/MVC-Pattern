package packAB;


public class 가장큰대칭수구하기 {
//	앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
//	두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
//	세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
	public static void main(String[] args) {
		int a=0;
		int b=0;
		int max =0;
		int answer=0;
		int maxbi =0;
		int numa =0;
		int numb =0;
		String bi1 ="";
		String bi2 ="";
		String bi3 ="";
		String bi4 ="";
		String bi5 ="";
		String bi6 ="";
		for(a=100; a<999; a++) {
			for(b=100; b<999; b++) {
				max=a*b;
				if(max>100000) {
					bi1=Integer.toString(max).substring (0,1);
					bi2=Integer.toString(max).substring (1,2);
					bi3=Integer.toString(max).substring (2,3);
					bi4=Integer.toString(max).substring (3,4);
					bi5=Integer.toString(max).substring (4,5);
					bi6=Integer.toString(max).substring (5,6);
				}
				if(bi1.equals(bi6)){
					if(bi2.equals(bi5)) {
						if(bi3.equals(bi4)) {
							maxbi=a*b;
							if(answer<maxbi) {
								answer =maxbi;

							}
							
							
						}
					}
				}
			}
		}

		System.out.println("an"+answer);
	}
}
		
		


