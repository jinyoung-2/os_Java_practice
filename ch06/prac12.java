package oosProject.ch06;

import java.util.Scanner;

class Person2 {
    private String name;
    private int [] randomArr;
    public Person2(String name){
        this.name=name;
        randomArr=new int[3];
    }
    public String getName(){
        return name;
    }
    public void setRandomArr(int[] num){
        for(int i=0;i<3;i++)
            randomArr[i]=num[i];
    }
    public boolean findWinner(){
        int a = randomArr[0];
        for(int i=1;i<3;i++){
            if(a!=randomArr[i])
                return false;
        }
        return true;
    }
}

public class prac12 {
    private static Scanner in = new Scanner(System.in);

    public static boolean run(Object obj) {
        if (obj != null && obj instanceof Person2) {
            Person2 p = (Person2) obj;
            int[] num = new int[3];
            System.out.print("[" + p.getName() + "]:<Enter>");   //Enter키 입력
            String enterkey = in.nextLine();
//            if (enterkey.equals("\n")) {
//            } //else문도 작성하기!!!
            System.out.print("\t"); // \t : tab키
            for (int i = 0; i < 3; i++) {
                num[i] = (int) (Math.random() * 3 + 1);
                System.out.print(num[i] + "\t");
            }
            p.setRandomArr(num);
            if (p.findWinner()) {
                System.out.println(p.getName() + "님이 이겼습니다!");
                return true;
            }
            else {
                System.out.println("아쉽군요!");
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.print("겜블링 게임에 참여할 선수 숫자>>");
        int memberNum = in.nextInt();
        in.nextLine();
        Person2[] p = new Person2[memberNum]; // 객체 배열 이용
        for(int i=1;i<=memberNum;i++){
            System.out.print(i+"번째 선수 이름>>");
            String name = in.nextLine();
            p[i-1] = new Person2(name);
        }
        boolean isWinner = false;
        while(true){
            for(int i=0;i<p.length;i++){
                if(run(p[i])){
                    isWinner=true;
                    break;
                }
            }
            if(isWinner)
                break;
        }
        in.close();
    }
}

