package packAB;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import common.CommonUtil;
import packC.C;

public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CommonUtil util = new CommonUtil();
		
		int MAX=6;
		int count =0;
		int[] lotto = new int[MAX];
		int[] chLotto = new int[MAX];
		String[] hah = new String[6];
		String[] hah2 = {"抽","籤","中",".",".","."};
		  Random rand = new Random();
		  Random rand2 = new Random();
		  int n1 = 0;
		  hah[0] ="추";
		  hah[1] ="첨";
		  hah[2] ="중";
		  hah[3] =".";
		  hah[4] =".";
		  hah[5] =".";
		  int[][] aa = new int[n1][6];		  
		 System.out.println("몇줄 사시겠습니까?");
		 n1 = util.inputNumberOnly();
		 System.out.println("");
//		System.out.println("직접입력[1] 자동[2]");
//		int gubun =sc.nextInt();
		  for(int k=0; k<MAX ; k++) {
			  for(int z=0; z<MAX ; k++) {
			  aa[z][k] = (int)(Math.random()*10)+1;;
			  for(int j =0; j<k; j++) {
					 if(aa[z][k]==aa[j][k]) {
						 k--;
					 }
			  }
			 }
		  }
		  System.out.println("ddddddddddddddddddd"+aa[1][1]);


	  
/*			  
		if (gubun==1) { 
		  	int i =0;
			 do {
		  		do {
				  System.out.println((i+1)+"번째숫자를 입력해주세요");
				  	 chLotto[i] = sc.nextInt();
				  	 if(chLotto[i]>45 || chLotto[i]<1) {
				  		 System.out.println(" 0~45까지의 숫자를 입력해주세요 ");
				  	 }
			  }while(chLotto[i]>45 || chLotto[i]<1);
			  for(int k =0; k<i; k++) {
				  if(chLotto[k]==chLotto[i]) {
					  System.out.println("중복숫자를 선택하셨습니다.");
						 i--;
						 break;
					 }
			  }
			  i++;
			 }while(i<MAX);
		  
		}else if(gubun==2) {
			for(int k=0; k<MAX ; k++) {
				chLotto[k] = rand.nextInt(45)+1;
				  for(int j =0; j<k; j++) {
					 if(chLotto[k]==chLotto[j]) {
						 k--;
					 }
				 }
		}
		
		  for(int k=0; k<MAX ; k++) {
			  for(int j=0; j<MAX ; j++) {
				  if(lotto[k]==chLotto[j]) {
					  count++;
				  }
			  }
		  }
		  }
			  System.out.println(" ");
		  for(int k=0; k<MAX ; k++) {
			  try{
				  Thread.sleep(1000);
			  } catch(InterruptedException e) {
				  e.printStackTrace();
			  }
			 System.out.println("lotto"+(k+1)+"番 :"+ lotto[k]); 
		  }
		  System.out.println(" ");

		  for(int k=0; k<hah.length ; k++) {
			  try{
				  Thread.sleep(1500);
			  } catch(InterruptedException e) {
				  e.printStackTrace();
			  }
			 System.out.print(hah2[k]+"\t"); 
		  }
		  System.out.println(" ");
			 
		  System.out.println(" ");
		  if(count==0||count==1||count==2) {
				  System.out.println(" 5等 ");
			  } else if (count==3) {
				  System.out.println("4等  :10만원 당첨 축하 드립니다 ");
			  } else if (count==4) {
				  System.out.println("3等 :500만원 당첨 축하드립니다 ");
			  } else if (count==5) {
				  System.out.println("2等 :5천만원 당첨 축하드립니다");
			  }else if (count==6) {
				  System.out.println("1等 :200억 당첨 축하드립니다");
			  }
		System.out.println("\n"+"---------------------------------------------------");
			System.out.print("購買番號 "+"\t");
		 for(int k=0; k<MAX ; k++) {
			 System.out.print(chLotto[k]+"\t");
		 }
		System.out.println("\n"+"---------------------------------------------------");	
		
		System.out.print("当籤番號 "+"\t");
		for(int k=0; k<MAX ; k++) {
			 System.out.print(lotto[k]+"\t");
		 }
		
		System.out.println("\n"+"---------------------------------------------------");	  
		  
				 
*/		
	}
}
