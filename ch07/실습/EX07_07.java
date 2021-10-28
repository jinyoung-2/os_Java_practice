package oosProject.ch07.실습;

import java.util.HashMap;
import java.util.Scanner;

// HashMap에 객체 저장, 학생 정보 관리
//id와 전화번호로 구성되는 Student 클래스를 만들고, 이름을 ‘키’로 하고 Student 객체를 ‘값’으로 하는 해시맵을 작성하라.

class Student{      // 학생을 표현하는 클래스
    private int id;
    private String tel;
    public Student(int id,String tel){
        this.id=id;
        this.tel=tel;
    }
    public int getId(){
        return id;
    }
    public String getTel(){
        return tel;
    }
}

public class EX07_07 {
    public static void main(String[] args) {
        HashMap<String,Student> map = new HashMap<>();

        //3명의 학생 저장
        map.put("황기태", new Student(1, "010-111-1111"));
        map.put("이재문", new Student(2, "010-222-2222"));
        map.put("김남윤", new Student(3, "010-333-3333"));

        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("검색할 이름?");
            String name = in.next();
            if(name.equals("exit"))
                break;
            Student std = map.get(name);
            if(std==null)
                System.out.println(name+"은 없는 사람입니다.");
            else
                System.out.println("id:"+std.getId()+", 전화:"+std.getTel());
        }
        in.close();
    }
}
