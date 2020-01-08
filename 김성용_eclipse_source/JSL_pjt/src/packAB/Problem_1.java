package packAB;

public class Problem_1 {
//	10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.
//
//	1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?
	public static void main(String[] args) {
		int max =1000;
		int sum =0;
		int three =0;
		int five =0;
		int fivteen =0;
		for(int k=1; k<max; k++) {
			if(k%3==0) {
				three += k;
			}
			if(k%5==0) {
				five += k;
			}
			if(k%15==0) {
				fivteen += k;
			}
			
		}
		sum= three+five-fivteen;
		System.out.println("ddd"+sum);
	}

}
