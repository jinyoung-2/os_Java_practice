package oosProject.ch04.실습;

public class 예제4_05 {
    String title;
    String author;
    void show(){
        System.out.println(title+" "+author);
    }

    public 예제4_05(){
       this("","");
        System.out.println("생성자 호출됨");
    }
    public 예제4_05(String title){
        this(title,"작자미상");
    }
    public 예제4_05(String title, String author){
        this.title=title;
        this.author=author;
    }

    public static void main(String[] args) {
        예제4_05 littlePrince = new 예제4_05("어린왕자","생텍쥐페리");
        예제4_05 loveStory = new 예제4_05("Bible");
        예제4_05 emptyBook = new 예제4_05();

        loveStory.show();
    }
}
