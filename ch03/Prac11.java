package oos.practice.chap03;

public class Prac11 {	//Average.java
	public static void main(String[] args) {
		int sum=0;
		float avg=0.0f;
		for(int i=0;i<args.length;i++) {
			//sum+=i; (X) ����: args�� String��
			sum+=Integer.parseInt(args[i]);	//���ڿ��� ������ ��ȯ
		}
		avg=sum/args.length;
		System.out.println(avg);
	}
}
