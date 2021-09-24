package oos.practice.chap02;
import java.util.Scanner;
public class Prac11 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int month=in.nextInt();
		String season;
		
		//Case 1) if-else문 
		if(month>=3&&month<=5)
			season="봄";
		else if(month>=6&&month<=8)
			season="여름";
		else if(month>=9&&month<=11)
			season="가을";
		else if(month==12||month==1||month==2)
			season="겨울";
		else
			season="잘못입력";
		System.out.println(season);
//		in.close();
		
		//Case 2) switch문 
		switch(month)
		{
			case 3:
			case 4:
			case 5:
				season="봄";
				break;
			case 6:
			case 7:
			case 8:
				season="여름";
				break;
			case 9:
			case 10:
			case 11:
				season="가을";
				break;
			case 12:
			case 1:
			case 2:
				season="겨울";
				break;
			default:
				season="잘못입력";
				break;
		}
		System.out.println(season);
		in.close();
	}
}
