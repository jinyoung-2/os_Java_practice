package oos.practice.chap03;

import java.util.Scanner;

public class Prac14 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		String course[]= {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score[]= {95,88,76,62,55};
		String subject;
		boolean matchTrue=false;
		int index = 0;
		
		while(true) {
			System.out.print("���� �̸�>>");
			subject=in.nextLine();
			
			//���� ����
			if(subject.equals("�׸�"))
				break;
			
			for(int i=0;i<course.length;i++) {
				if(course[i].equals(subject)) {
					index=i;
					matchTrue=true;
					break;
				}
			}
			//�ش� ������ ���� ��� 
			if(!matchTrue)	//matchTrue==false
				System.out.println("���� �����Դϴ�.");
			//�ش� ���� �����ϴ� ��� -> �ش� ������ ã�ƾ� �� 
			else 
				System.out.println(subject+"�� ������ "+score[index]);
		}
		in.close();
	}
}
