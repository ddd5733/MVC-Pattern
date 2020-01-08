package packAB;


public class PibonachiEven {

	public static void main(String[] args) {
	int a1=1;
	int a2=2;
	int sum=0;
	for(int a3=3; a3<=4000000; a3=a1+a2) {
		if(a2==2)sum+=a2;
		if(a3%2==0)sum+=a3;
		a1=a2;
		a2=a3;
		a3=a1+a2;
	}
	System.out.println("sum"+sum);
	}
}
