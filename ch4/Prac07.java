package oosProject.ch4;

import java.util.Scanner;

public class Prac07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Day객체배열
        Day[] dayArr = new Day[30];
        int day;
        String mustDo="";
        boolean exitCheck=false;

        System.out.println("이번달 스케쥴 관리 프로그램.");
        while(true){
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int num = in.nextInt();
            switch (num){
                case 1:
                    System.out.print("날짜(1~30)?");
                    day = in.nextInt();
                    in.nextLine();
                    dayArr[day-1]=new Day();    //객체 생성

                    System.out.print("할일(빈칸없이입력)?");
                    mustDo = in.nextLine();
                    dayArr[day-1].set(mustDo);

                    System.out.println();
                    break;
                case 2:
                    System.out.print("날짜(1~30)?");
                    day = in.nextInt();
                    System.out.print(day+"일의 할 일은 ");
                    dayArr[day-1].show();
                    System.out.println();
                    break;
                case 3:
                    exitCheck=true;
                    System.out.println("프로그램을 종료합니다.");
                    break;
            }
            if(exitCheck)
                break;
        }
    }
}

class Day{
    private String work;  //하루의 할 일을 나타내는 문자열
    public void set(String work){
        this.work = work;
    }
    public String get(){
        return work;
    }
    public void show(){
        if(work==null)
            System.out.println("없습니다.");
        else
            System.out.println(work+"입니다.");
    }
}