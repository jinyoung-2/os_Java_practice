package oos.practice.chap03;

public class Prac01_DoWhileTest {
	public static void main(String[] args) {
		int sum=0,i=0;
		do {
			sum+=i;
			i+=2;
		}while(i<100);
		System.out.println(sum);
	}
}
