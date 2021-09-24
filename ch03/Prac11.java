package oos.practice.chap03;

public class Prac11 {	//Average.java
	public static void main(String[] args) {
		int sum=0;
		float avg=0.0f;
		for(int i=0;i<args.length;i++) {
			//sum+=i; (X) 이유: args는 String형
			sum+=Integer.parseInt(args[i]);	//문자열을 정수로 변환
		}
		avg=sum/args.length;
		System.out.println(avg);
	}
}
