package oosProject.ch06;

import java.util.Scanner;

// 문자열 입력받아 한 글자씩 회전시켜 모두 출력
public class prac08 {
    public static void main(String[] args) {
        System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어, 한글 모두 됩니다.");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        // str = I Love you
        for(int i=0;i<str.length();i++){
            char a = str.charAt(0);
            str=str.substring(1)+a;
            System.out.println(str);
        }
    }
}