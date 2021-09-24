package oos.practice.chap02;
import java.util.Scanner;
public class Prac07 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int x,y;
		
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		x=in.nextInt();
		y=in.nextInt();
		
		if((x>=100&&x<=200)&&(y>=100&&y<=200))	//성공
			System.out.println("("+x+","+y+")는 사각형 안에 있습니다.");
		else //실페
			System.out.println("("+x+","+y+")는 사각형 안에 없습니다.");
		
		in.close();
	}
}
