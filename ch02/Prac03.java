package oos.practice.chap02;
import java.util.Scanner;
public class Prac03 {
//	public static void main(String[] args)
//	{
//		Scanner in = new Scanner(System.in);
//		System.out.print("금액을 입력하시오>>");
//		int money=in.nextInt();
//		
//		//Point: 상수 이용
//		final int WON_50000 = 50000;
//		final int WON_10000 = 10000;
//		final int WON_1000 = 1000;
//		final int WON_100 = 100;
//		final int WON_50 = 50;
//		final int WON_10 = 10;
//		final int WON_1 = 1;
//		
//		if(money>WON_50000) {
//			System.out.println("오만원권 "+money/50000+"매");
//			money%=50000;	//주의사항: -를 하면 안 됨
//		}
//		if(money>WON_10000) {
//			System.out.println("만원권 "+money/WON_10000+"매");
//			money%=WON_10000;
//		}
//		if(money>WON_1000) {
//			System.out.println("천원권 "+money/WON_1000+"매");
//			money%=WON_1000;
//		}
//		if(money>WON_100) {
//			System.out.println("백원 "+money/WON_100+"매");
//			money%=WON_100;
//		}
//		if(money>WON_50) {
//			System.out.println("오십원 "+money/WON_50+"매");
//			money%=WON_50;
//		}
//		if(money>WON_10) {
//			System.out.println("십원 "+money/WON_10+"매");
//			money%=WON_10;
//		}
//		if(money>WON_1) {
//			System.out.println("일원 "+money/WON_1+"매");
//		}		
//		
//		in.close();
//	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[] won= {50000,10000,1000,500,100,50,10,1};
		System.out.print("금액을 입력하시오>>");
		int money=in.nextInt();
		
		for(int i=0;i<won.length;i++) {
			System.out.println(won[i]+"권 "+money/won[i]+"매");
			money%=won[i];
		}	
		
		in.close();
	}
}
