package oos.practice.chap03;

public class Prac12 {
	public static void main(String[] args) {
		//������ �� ����
		int sum=0;
		for(int i=0;i<args.length;i++) {
			try {
				sum+=Integer.parseInt(args[i]);
			}
			catch(NumberFormatException err) {
				continue;
			}
		}
		System.out.println(sum);
	}
}
