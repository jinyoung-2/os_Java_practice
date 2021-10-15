package oosProject.ch06;

import java.util.Scanner;

class Person{
    private String name;
    private int [] randomArr;
    public Person(String name){
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

public class prac10 {
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
        System.out.print("1번째 선수 이름>>");
        String name = in.nextLine();
        Person2 p1 = new Person2(name);
        System.out.print("2번째 선수 이름>>");
        name = in.nextLine();
        Person2 p2 = new Person2(name);

        while(true){
            if(run(p1))
                break;
            else if(run(p2))
                break;
        }
        in.close();
    }
}

