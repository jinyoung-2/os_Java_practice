package oosProject.ch4;

import java.util.Scanner;

public class Prac08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("인원수>>");
        int num = in.nextInt(); //인원수
        Phone[] phoneArr = new Phone[num];

        for(int i=0;i<num;i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = in.next();
            String tel = in.next();
            phoneArr[i] = new Phone(name,tel);
        }
        System.out.println("저장되었습니다...");

        //이름 검사
        boolean findName = false;
        while(true){
            System.out.print("검색할 이름>>");
//            in.nextLine();
            String name = in.next();
            if(name.equals("그만"))
                break;
            for(int i=0;i<phoneArr.length;i++){
                if(phoneArr[i].findTrue(name)){   //존재하는 경우
                    System.out.println(name+"의 번호는 "+phoneArr[i].getTel()+" 입니다.");
                    findName=true;
                    break;
                }
            }
            if(findName==false){
                System.out.println(name+"이 없습니다.");
            }
        }
        in.close();
    }
}

class Phone{
    private String name;
    private String tel; //전화번호

//    Phone(){
//        this("","");
//    }
    Phone(String name,String tel){
        this.name=name;
        this.tel=tel;
    }

    public String getTel(){
        return tel;
    }
    public boolean findTrue(String name){
        if(this.name.equals(name))
            return true;
        return false;
    }
}