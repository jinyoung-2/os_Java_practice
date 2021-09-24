package oos.practice.chap02;
import java.util.Scanner;
public class Prac00 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수 >> ");
		String str1=in.next();		//String str1=in.nextLine();
		System.out.print("영희 >> ");
		String str2=in.next();		//String str2=in.nextLine();
		
		//문자열 비교 => equals()
		//비길 때
		if(str1.equals(str2)){
			System.out.println("비겼습니다.");
			return ;
		}
		
		//승자가 나올 때
		//철수 승리
		if(str1.equals("가위")&&str2.equals("보"))
			System.out.println("철수가 이겼습니다.");
		else if(str1.equals("보")&&str2.equals("바위"))
			System.out.println("철수가 이겼습니다.");
		else if(str1.equals("바위")&&str2.equals("가위"))
			System.out.println("철수가 이겼습니다.");
		
		//영희 승리
		if(str2.equals("가위")&&str1.equals("보"))
			System.out.println("영희가 이겼습니다.");
		else if(str2.equals("보")&&str1.equals("바위"))
			System.out.println("영희가 이겼습니다.");
		else if(str2.equals("바위")&&str1.equals("가위"))
			System.out.println("영희가 이겼습니다.");
		
		in.close();
	}
}
