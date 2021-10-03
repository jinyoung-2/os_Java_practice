package oosProject.ch4;

import java.util.Scanner;

public class Prac02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math = in.nextInt();
        int sci = in.nextInt();
        int eng = in.nextInt();

        Grade me = new Grade(math, sci, eng);
        System.out.println("평균은 "+me.average());

        in.close();
    }
}

class Grade{
    private int math;
    private int sci;
    private int eng;

//    Grade(){
//        this(100,100,100);
//    }
    Grade(int math, int sci, int eng){
        this.math = math;
        this.sci = sci;
        this.eng = eng;
    }

    int average(){
        return (math+sci+eng)/3;
    }
}