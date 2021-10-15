package oosProject.ch05;

public class prac01 {
    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32,1024);
        myTV.printProperty();
    }
}

class TV{
    private int size;
    public TV(int size){
        this.size=size;
    }
    protected int getSize(){
        return size;
    }
}

class ColorTV extends TV{
    private int color;
    public ColorTV(int size, int color){
        super(size);
        this.color=color;
    }
    protected void printProperty(){
        System.out.println(getSize()+"인치 "+color+"컬러");
    }
}