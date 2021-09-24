package oos.practice.chap02;
import java.util.Scanner;
public class Prac12 {
//	public static void main(String[] args)
//	{
//		Scanner in = new Scanner(System.in);
//		
//		//입력
//		System.out.print("연산>>");
//		float num1=Float.parseFloat(in.next());
//		char cal=in.next().charAt(0);
//		float num2=Float.parseFloat(in.next());
//		float result=0f;
//		
//		//알고리즘
//		if(cal=='+')
//			result=num1+num2;
//		else if(cal=='-')
//			result=num1-num2;
//		else if(cal=='*')
//			result=num1*num2;
//		else if(cal=='/')
//		{
//			if(num2==0) {
//				System.out.println("0으로 나눌 수 없습니다.");
//				return ;
//			}
//			result=num1/num2;
//		}
//		System.out.println(num1+cal+num2+"의 계산 결과는 "+ result);	
//		//Q. char형을 이용할 때, num1+cal+num2를 하면 답이 이상하게 도출됨
//		//A. char형으로 cal에는 아스키코드 번호가 들어가게 된다 => 숫자들의 덧셈연산이 되어 오류 발생 
//		// => 문자열로 입력받는 것 추천
//	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//입력
		System.out.print("연산>>");
		double n1=in.nextDouble();
		String s=in.next();
		double n2=in.nextDouble();
		double result=0;
		boolean isRight=true;
		
		//Case 1. if-else문
//		if(s.equals("+"))
//			result=n1+n2;
//		else if(s.equals("-"))
//			result=n1-n2;
//		else if(s.equals("*"))
//			result=n1*n2;
//		else if(s.equals("/")) {
//			if(n2==0) 
//				isRight=false;
//			else
//				result=n1/n2;
//		}
//		if(!isRight)
//			System.out.println("0으로 나눌 수 없습니다.");
//		else
//			System.out.println(n1+s+n2+"의 계산 결과는 "+result);
//		
//		in.close();
		
		
		//Case 2. switch문
		//Q. 자료형이 문자열인데, switch를 사용할 수 있는건가? 
		//A. switch문의 조건식에 문자열 허용 + case문의 값에 문자열 상수 허용 
		switch(s)
		{
			case "+":			
				result=n1+n2;
				break;
			case "-":
				result=n1-n2;
				break;
			case "*":
				result=n1*n2;
				break;
			case "/":
				isRight=false;
				break;
		}
		if(isRight==false)
		{
			if(n2==0){
				System.out.println("0으로 나눌 수 없습니다.");
				in.close();	//Q. return ;라고 사용할 수 있는건가?
			}
			else
				result=n1/n2;
		}
		System.out.println(n1+s+n2+"의 계산 결과는 "+result);
		in.close();
	}
}
