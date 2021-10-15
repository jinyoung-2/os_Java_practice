package oosProject.ch06.실습;

//Rect 클래스와 equals() 만들기 연습
class Rect{
    private int width;
    private int height;
    public Rect(int width,int height){
        this.width=width;
        this.height=height;
    }
    public boolean equals(Object obj){
//        Rect rect = (Rect)obj;
//        if(width*height== rect.height* rect.width)
//            return true;
//        return false;
        if(obj!=null && obj instanceof Rect){
            Rect rect = (Rect) obj;
            return width*height==((Rect) obj).width*((Rect) obj).height;
        }else
            return false;
    }
}

public class Ex06_04 {
    public static void main(String[] args) {
        Rect a = new Rect(2,3);
        Rect b = new Rect(3,2);
        Rect c = new Rect(3,4);
        if(a.equals(b))
            System.out.println("a is equal to b");
        if(a.equals(c))
            System.out.println("a is equal to c");
        if(b.equals(c))
            System.out.println("b is equal to c");
    }
}
