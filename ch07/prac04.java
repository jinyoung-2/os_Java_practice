package oosProject.ch07;

import java.util.Scanner;
import java.util.Vector;

public class prac04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        while(true){
            int sum=0, average=0;
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int rainfall = in.nextInt();
            if(rainfall==0)
                break;
            v.add(rainfall);
            for(int i=0;i<v.size();i++){
                int n = v.get(i);
                System.out.print(n+"\t");
                sum+=n;
            }
            System.out.println();
            average=sum/v.size();
            System.out.println("현재 평균 "+average);
        }
        in.close();
    }
}
