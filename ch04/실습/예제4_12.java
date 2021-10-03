package oosProject.ch04.실습;

import java.util.Scanner;

//static 멤버를 이용하여 달러와 원화를 변환 해주는 환율 계산기를 만들어보자.
public class 예제4_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("환율(1달러)>> ");
        double rate = in.nextDouble();

        //미국 달러 환율 설정
        CurrencyConverter.setRate(rate);

        System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) +"입니다.");
        System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "원입니다.");
        in.close();
    }
}

class CurrencyConverter{
    //한국 원화에 대한 환율
    private static double rate;

    //한국 원화를 달러로 변환
    public static double toDollar(double won){
        return won/rate;
    }

    //달러를 한국 원화로 변환
    public static double toKWR(double dollar){
        return dollar*rate;
    }

    //환율 설정 KWR/$1
    public static void setRate(double r){
        rate=r;
    }
}