package oosProject.ch4;

public class Prac04 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,2,8,7);
        Rectangle s = new Rectangle(5,5,6,6);
        Rectangle t = new Rectangle(1,1,10,10);

        r.show();
        System.out.println("s의 면적은 "+s.square());
        if(t.contains(r))
            System.out.println("t는 r을 포함합니다.");
        if(t.contains(s))
            System.out.println("t는 s를 포함합니다.");
    }
}

class Rectangle{
    private int x,y;            //사각형 구성하는 점에 대한 정보
    private int width, height;  //사각형 구성하는 크기에 대한 정보

    //생성자
    Rectangle(){
        this(0,0,1,1);
    }
    Rectangle(int x, int y, int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    int square(){   //사각형 넓이 리턴
        return width*height;
    }
    void show(){    //사각형의 좌표와 넓이를 화면에 출력
        System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
    }
    boolean contains(Rectangle r){  //매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
        if(x<r.x && r.x+r.width<x+width){ //가로
            if(y<r.y && r.y+r.height<y+height) //세로
                return true;
        }
        return false;
    }
}