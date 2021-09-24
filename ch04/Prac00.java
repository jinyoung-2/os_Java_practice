package oosProject.ch4;

import java.util.Scanner;

public class Prac00 {   //WordGameApp 클래스
    static Scanner in = new Scanner(System.in);
    static int num = 0; //인원 수

    public static void main(String[] args) {
        System.out.println("끝말잇기 게임을 시작합니다...");
        Prac00.run();
    }

    //게임을 전체적으로 진행하는 메서드
    public static void run(){
        //선수 숫자만큼의 Player 객체를 배열로 생성
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        num = in.nextInt();
        in.nextLine();
        Player[] playerArr = new Player[num];

        getWordFromUSer(playerArr);
    }

    //게임 참가자의 이름 필드와 사용자로부터 단어를 입력받는 메서드
    public static void getWordFromUSer(Player[] playerArr){
        //게임 참가자의 이름 필드 입력
        for(int i=0;i<num;i++){
            System.out.print("참가자의 이름을 입력하세요>>");
            String name = in.nextLine();
            playerArr[i] = new Player(name);
        }

        //사용자가 단어 입력
        String word = "아버지";
        int lastIndex;
        char lastChar=' ';
        boolean breakCheck = false;
        System.out.println("시작하는 단어는 "+word+"입니다");

        while(true){
            for(int i=0;i<playerArr.length;i++){
                lastIndex = word.length()-1;        //마지막 문자에 대한 인덱스
                lastChar = word.charAt(lastIndex); //마지막 문자

                System.out.print(playerArr[i].getName()+">>");
                word = in.next();
                if(!checkSuccess(word,lastChar)){
                    System.out.println(playerArr[i].getName()+"이 졌습니다.");
                    breakCheck=true;
                    break;
                }
            }
            if(breakCheck)
                break;
        }
    }

    //끝말잇기의 성공여부와 게임을 계속하는지 판별하는 메서드
    public static boolean checkSuccess(String word,char lastChar){
        char firstChar = word.charAt(0);        //첫번째 문자
        if(firstChar==lastChar) //성공시
            return true;
        return false;           //실패시
    }
}

//각 선수
class Player{
    private String name;

    Player(){
        this("");
    }
    Player(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}