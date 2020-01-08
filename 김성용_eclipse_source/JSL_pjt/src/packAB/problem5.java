package packAB;

public class problem5 {

	public static void main(String[] args) {
//		1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
//		그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
//			int a =1;
//			boolean gubun =true;
//			while(gubun) {
//				a++;
//				if ( a%2==0&&a%3==0&&a%4==0&&a%5==0&&a%6==0&&a%7==0&&a%8==0&&a%9==0&&a%10==0&&
//					 a%11==0&&a%12==0&&a%13==0&&a%14==0&&a%15==0&&a%16==0&&a%17==0&&a%18==0&&a%19==0&&a%20==0) {
//					System.out.println(a);
//					break;
//				}
//			
				
//			}
		
		int a = 0;
		int out=0;
		while(out != 20){
			a=a+1;
			for(int i=1;i<21;i++){
				if(a%i != 0)
					break;
				else
					out=i;				
			}		
		}
		System.out.println(a);
		}
	}


