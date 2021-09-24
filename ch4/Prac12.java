package oosProject.ch4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prac12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        Concert concert = new Concert();
        try{
            while(true){
                System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
                int selectNum = in.nextInt();
                switch(selectNum) {
                    case 1: //예약
                        concert.reserveSeat();
                        break;
                    case 2: //조회
                        concert.printSeatAll();
                        break;
                    case 3: //취소
                        concert.cancelSeatAscend();
                        break;
                    case 4: //끝내기
                        break;
                    default :   //예외
                        System.out.println("없는 메뉴입니다. 다시 입력해 주세요.");
                }
            }
        }catch (InputMismatchException err){
            System.out.println("올바르지 않는 입력 형식입니다.");
        }
    }
}

class Concert{
    private String[] S;
    private String[] A;
    private String[] B;
    private Scanner in;

    //생성자
    Concert(){
        in = new Scanner(System.in);
        //객체 배열 생성
        S = new String[10];
        A = new String[10];
        B = new String[10];

        for(int i=0;i<10;i++){
            S[i] = "---";
            A[i] = "---";
            B[i] = "---";
        }
    }

    //print S,A,B 중 하나 출력
    public void printSeatOne(String[] seat){
        for(int i=0;i<seat.length;i++){
            System.out.print(" "+seat[i]);
        }
        System.out.println();
    }

    //print S,A,B 모두 출력
    public void printSeatAll(){
        System.out.print("S>>");
        printSeatOne(S);

        System.out.print("A>>");
        printSeatOne(A);

        System.out.print("B>>");
        printSeatOne(B);

        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    //예약
    public void reserveSeat(){
           try{
               while(true){
                   System.out.print("좌석구분 S(1), A(2), B(3)>>");
                   int select = in.nextInt();
                   switch(select) {
                       case 1:
                           System.out.print("S>>");
                           printSeatOne(S);
                           inputSeat(S);
                           return;
                       case 2:
                           System.out.print("A>>");
                           printSeatOne(A);
                           inputSeat(A);
                           return;
                       case 3:
                           System.out.print("B>>");
                           printSeatOne(B);
                           inputSeat(B);
                           return;
                       default:
                           System.out.println("없는 번호입니다. 다시 입력해 주세요.");
                   }
               }
           }catch (InputMismatchException err){
               System.out.println("올바르지 않는 입력 형식입니다.");
           }
    }

    //좌석에 이름 넣기
    public void inputSeat(String[] seat){
        System.out.print("이름>>");
        String name = in.next();
        try{
            while(true){
                System.out.print("번호>>");
                int num = in.nextInt();
                if(num<0||num>=seat.length){
                    System.out.println("없는 좌석번호입니다. 다시 입력해주세요.");
                    continue;
                }
                //올바른 경우
                seat[num-1] = name;
                return ;
            }
        }catch (InputMismatchException err){
            System.out.println("올바르지 않는 입력 형식입니다.");
        }
    }

    public void cancelSeatAscend() {
        try{
            while(true){
                System.out.print("좌석 S:1, A:2, B:3>>");
                int select = in.nextInt();
                switch(select) {
                    case 1:
                        System.out.print("S>>");
                        printSeatOne(S);
                        cancelSeat(S);
                        return;
                    case 2:
                        System.out.print("A>>");
                        printSeatOne(A);
                        cancelSeat(A);
                        return;
                    case 3:
                        System.out.print("B>>");
                        printSeatOne(B);
                        cancelSeat(B);
                        return;
                    default:
                        System.out.println("없는 번호입니다. 다시 입력해 주세요.");
                }
            }
        }catch (InputMismatchException err){
            System.out.println("올바르지 않는 입력 형식입니다.");
        }
    }

    public void cancelSeat(String[] seat) {
        try {
            while (true) {
                System.out.print("이름>>");
                String name = in.next();
                for (int i = 0; i < seat.length; i++) {
                    if (seat[i].equals(name)) {
                        seat[i] = "---";
                        System.out.println();
                        return;
                    }
                }
                //취소할 이름이 존재하지 않는 경우
                System.out.println("잘못된 취소입니다. 다시 이름을 입력해주세요.");
            }
        }catch(InputMismatchException err){
                System.out.println("올바르지 않는 입력 형식입니다.");
        }
    }
}
