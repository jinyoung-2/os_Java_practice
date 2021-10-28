package oosProject.ch07.실습;

import java.util.HashMap;
import java.util.Scanner;

// HashMap을 이용하여 (영어, 한글) 단어 쌍의 저장 검색
public class EX07_05 {
    public static void main(String[] args) {
        HashMap<String,String> dic = new HashMap<>();
        dic.put("baby","아기");
        dic.put("love","사랑");
        dic.put("apple","사과");

        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("찾고 싶은 단어는?");
            String eng = in.next();
            if(eng.equals("exit")){
                System.out.println("종료합니다...");
                break;
            }
            String kor = dic.get(eng);
            if(kor==null)
                System.out.println(eng+"는 없는 단어입니다.");
            else
                System.out.println(kor);
        }
        in.close();
    }
}
