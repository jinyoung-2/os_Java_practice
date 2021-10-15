package oosProject.ch05;

public class prac05 {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5,5,"YELLOW");
        cp.setXY(10,20);
        cp.setColor("RED");
        String str=cp.toString();
        System.out.println(str+"입니다.");
    }
}

class ColorPoint extends Point{
    private String color;
    public ColorPoint(int x, int y, String color){
        super(x,y);
        this.color=color;
    }

    //중요 Point!!
    //super의 private instance variable값 변경
    //서브 클래스에서 super를 이용해서 변경 불가(=외부클래스에서 부모 클래스에 접근하는 것이므로)
    //해결법: 부모클래스에서 iv를 변경할 수 있는 메서드 생성하여, 서브 클래스에서 호출함으로써 변경되도록 한다!
    public void setXY(int x, int y){
        move(x,y);
    }
    public void setColor(String color){
        this.color=color;
    }
    public String toString(){
        return color+"색의 "+"("+ getX() +","+ getY() +")의 점";
    }
}