package oos.practice.chap03;

import java.util.Scanner;

public class Prac14 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		String course[]= {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int score[]= {95,88,76,62,55};
		String subject;
		boolean matchTrue=false;
		int index = 0;
		
		while(true) {
			System.out.print("과목 이름>>");
			subject=in.nextLine();
			
			//종료 조건
			if(subject.equals("그만"))
				break;
			
			for(int i=0;i<course.length;i++) {
				if(course[i].equals(subject)) {
					index=i;
					matchTrue=true;
					break;
				}
			}
			//해당 과목이 없는 경우 
			if(!matchTrue)	//matchTrue==false
				System.out.println("없는 과목입니다.");
			//해당 과목 존재하는 경우 -> 해당 점수를 찾아야 함 
			else 
				System.out.println(subject+"의 점수는 "+score[index]);
		}
		in.close();
	}
}
