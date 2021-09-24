package oos.practice.chap03;

import java.util.Scanner;

public class Prac16_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String user;
		String computer;
		String[] str= {"가위","바위","보"};
		int randIndex;
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			//사용자 결정
			System.out.print("가위 바위 보!>>");
			user=in.nextLine();
			
			//종료조건 
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;	//Q. in.close()를 하면 안 되는 이유는? 작성시 무한반복이 되는 이유는?
			}
			//Enter키 입력시, 자동으로 컴퓨터 결정
			randIndex=(int)(Math.random()*3);
			computer=str[randIndex];
			
			System.out.print("사용자 = "+user+", 컴퓨터 = "+computer);
			//비긴 경우
			if(user.equals(computer)) 
				System.out.println(", 비겼습니다.");
			//사용자가 이긴 경우//사용자가 진 경우 
			if(user.equals("가위")) {
				if(computer.equals("바위")) //사용자가 이긴 경우
					System.out.println(", 사용자가 이겼습니다.");
				else if(computer.equals("보")) //사용자가 진 경우
					System.out.println(", 사용자가 졌습니다.");
			}
			else if(user.equals("바위")) {
				if(computer.equals("가위")) //사용자가 이긴 경우
					System.out.println(", 사용자가 이겼습니다.");
				else if(computer.equals("보")) //사용자가 진 경우
					System.out.println(", 사용자가 졌습니다.");
			}
			else if(user.equals("보")) {
				if(computer.equals("바위")) //사용자가 이긴 경우
					System.out.println(", 사용자가 이겼습니다.");
				else if(computer.equals("가위")) //사용자가 진 경우
					System.out.println(", 사용자가 졌습니다.");
			}	
		}
	}
}
