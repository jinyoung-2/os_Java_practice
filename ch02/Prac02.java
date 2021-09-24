package oos.practice.chap02;
import java.util.Scanner;
public class Prac02 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int num=in.nextInt();
		
		//추가하면 좋을 예외처리 => 10~99 사이의 정수인지 
		if(num<10||num>99) {
			System.out.println("입력된 정수는 조건에 해당하지 않습니다.");
			in.close();		//Q. return ; 라고 작성해도 되나?
		}
		
		if(num%10==num/10)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		in.close();
	}
}
