package oosProject.ch05;

public class prac06 {
    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint();
        System.out.println(zeroPoint.toString()+"입니다.");

        ColorPoint cp = new ColorPoint(10,10);
        cp.setXY(5,5);
        cp.setColor("RED");
        System.out.println(cp.toString()+"입니다.");
    }

}


class ColorPoint extends Point{
    private String color;
    public ColorPoint() {
        super(0, 0);
        this.color = "BLACK";
    }
    public ColorPoint(int x, int y) {
        super(x, y);
        this.color = "BLACK";
    }
    public void setXY(int x, int y) {
        move(x, y);
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        String tmp = color+"색의 ("+getX()+","+getY()+") 점";
        return tmp;
    }
}