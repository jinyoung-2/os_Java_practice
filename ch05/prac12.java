package oosProject.ch05;

import java.util.Scanner;

// 추상 클래스
abstract class Shape2 {
    private Shape2 next;
    public Shape2() { next = null;}
    public void setNext(Shape2 obj) { next = obj;} // 링크 연결
    public Shape2 getNext() { return next;}
    public abstract void draw();
}
class Line extends Shape2{
    String name ="line";
    public void draw() {
        System.out.println("Line");
    }
}
class Rect extends Shape2{
    String name ="Rect";
    public void draw() {
        System.out.println("Rect");
    }
}
class Circle extends Shape2{
    String name ="circle";
    public void draw() {
        System.out.println("Circle");
    }
}

public class prac12 {   //문제 속 class GraphicEditor
    private Shape2 head,tail;
    private Scanner in;
    public prac12(){    //Q. 생성자 작성하는 이유
        head=null;
        tail=null;
        in=new Scanner(System.in);
    }
    public void run(){
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while(true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            int menuNum=in.nextInt();
            switch (menuNum){
                case 1:
                    //삽입
                    System.out.print("Line(1), Rect(2), Circle(3) >> ");
                    int draw=in.nextInt();
                    insert(draw);
                    break;
                case 2:
                    //삭제
                    System.out.print("삭제할 도형의 위치 >> ");
                    int delNum=in.nextInt();
                    delete(delNum);
                    break;
                case 3:
                    //모두 보기
                    print();
                    break;
                case 4:
                    //종료
                    System.out.println("beauty을 종료합니다.");
                    in.close();
                    return;
                default:
                    System.out.println("잘못된 번호입니다.");
                    break;
            }
        }
    }

    public void insert(int draw){   //노드 삽입
        Shape2 grapic;
        switch (draw){
            case 1:
                grapic=new Line();
                break;
            case 2:
                grapic=new Rect();
                break;
            case 3:
                grapic=new Circle();
                break;
            default:
                System.out.println("다시 입력해주세요.");
                return;
        }
        if(head==null){     //head가 아무것도 가리키지 않으면
            head=grapic;    //head랑 tail이 새로운 노드를 가리킴
            tail=grapic;
        }
        else{
            tail.setNext(grapic);   //끝 노드에 새로운 노드를 연결하고,
            tail=grapic;            //끝 노드는 새로 만들어진 노드를 가리키게 함

        }
    }
    public void delete(int delNum){ //delNum은 몇 번째 노드인지 찾아야 함
        Shape2 cur = head;  //현재 노드
        Shape2 past = head;
        int i;
        if(delNum==1){  //첫번째 노드를 삭제하는 경우
            if(head==tail){ //노드가 한 개인 경우
                head=null;
                tail=null;
                return ;
            }
            else{   //노드가 두 개 이상
                head=head.getNext();
                return ;
            }
        }
        for(i=1;i<delNum;i++){
            past=cur;    //현재 노드 저장 후(즉, 이전 노드)
            cur=cur.getNext();
            if(cur==null){  //노드 수가 입력값보다 적을 때
                System.out.println("삭제할 수 없습니다.");
                return ;
            }
        }
        if(i==delNum){  //끝 노드를 가리킬 때
            past.setNext(cur.getNext());    //??
            tail=past;
        }
        else    //끝노드가 아니라면 이전노드가 다음 노드를 가리킴(즉, 현재 노드 삭제)
            past.setNext(cur.getNext());
    }
    public void print(){    //전체 노드 출력
        Shape2 s = head;
        while(s!=null){
            s.draw();
            s=s.getNext();
        }
    }
    public static void main(String[] args) {
       prac12 graphEditor = new prac12();
       graphEditor.run();
    }
}