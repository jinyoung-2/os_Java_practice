package oos.practice.chap03;

import java.util.Scanner;

public class Prac16_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] str= {"가위","바위","보"};
		int winner=0;
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			//사용자 결정
			System.out.print("가위 바위 보!>>");
			String user=in.nextLine();
			
			//종료조건 
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			//Enter키 입력시, 자동으로 컴퓨터 결정
			int randIndex=(int)(Math.random()*3);
			String computer=str[randIndex];
			
			switch(user) {
			case "가위":
				if(computer.equals("가위"))
					winner=1;
				else if(computer.equals("바위"))
					winner=2;
				else
					winner=3;
				 break;
			case "바위":
				if (computer.equals("가위"))
					winner=3;
				else if (computer.equals("바위"))
					winner=1;
				else
					winner=2;
				break;
			case "보":
				if (computer.equals("가위"))
					winner=2;
				else if (computer.equals("바위"))
					winner=3;
				else
					winner=1;
				break;	 
			}
			
			if (winner==1)
				System.out.println("사용자 = "+user+" , 컴퓨터 = "+computer+", 비겼습니다.");
			else if (winner==2)
				System.out.println("사용자 = "+user+" , 컴퓨터 = "+computer+", 컴퓨터가 이겼습니다.");
			else
				System.out.println("사용자 = "+user+" , 컴퓨터 = "+computer+", 사용자가 이겼습니다.");
		}
	}
}
