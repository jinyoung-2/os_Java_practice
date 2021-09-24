package oosProject.ch4;

import java.util.Scanner;

public class Prac10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dictionary dic = new Dictionary();

        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true){
            System.out.print("한글 단어?");
            String word = in.next();
            if(word.equals("그만"))
                break;

            System.out.println(word+"은/는 "+dic.kor2Eng(word));
        }
    }
}

class Dictionary{
    private static String[] kor = {"사랑","아기","돈","미래","희망"};
    private static String[] eng = {"love","baby","money","future","hope"};
    public static String kor2Eng(String word){
        /* 검색 코드 작성 */
        for(int i=0;i<kor.length;i++){
            if(kor[i].equals(word)){    //존재하는경우
                return eng[i];
            }
        }
        //존재하지 않는 경우
        return "저의 사전에 없습니다.";
    }
}