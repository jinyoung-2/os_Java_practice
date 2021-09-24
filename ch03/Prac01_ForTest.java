package oos.practice.chap03;

public class Prac01_ForTest {
	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<100;i++) {
			sum+=i;
			i+=2;
		}
		System.out.println(sum);
	}
}