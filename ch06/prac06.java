package oosProject.ch06;

import java.util.Calendar;
import java.util.Scanner;

class Person3{
    Calendar now = Calendar.getInstance();
    Scanner in = new Scanner(System.in);
    private String name,enterKey;
    private int sec1,sec2;

    public Person3(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int play(){
        System.out.print(name+" 시작 <Enter>키 >>");
        sec1=enter();
        System.out.print("10초 예상 후 <Enter>키>>");
        sec2=enter();
        if(sec1<sec2)
            return sec2-sec1;
        else
            return (60-sec1)+sec2;
    }
    public int enter(){
        enterKey=in.nextLine();
        now = Calendar.getInstance();
        System.out.println("\t현재 초 시간 = "+ now.get(Calendar.SECOND));
        return now.get(Calendar.SECOND);
    }
}

public class prac06 {
    public static void main(String[] args) {
        Person3 p1 = new Person3("황기태");
        Person3 p2 = new Person3("이재문");

        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        int result1 = p1.play();
        int result2 = p2.play();

        if(Math.abs(result1-10)<Math.abs(result2-10))
            System.out.println("황기태의 결과 "+result1+", 이재문의 결과"+result2+" ,승자는 황기태");
        else
            System.out.println("황기태의 결과 "+result1+", 이재문의 결과"+result2+" ,승자는 이재문");
    }
}
