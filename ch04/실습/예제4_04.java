package oosProject.ch04.실습;

public class 예제4_04 {
    String title;
    String author;

    public 예제4_04(String t){
        title=t;
        author="작자미상";
    }
    public 예제4_04(String title, String author){
        this.title=title;
        this.author=author;
    }

    public static void main(String[] args) {
        예제4_04 littlePrince = new 예제4_04("어린왕자","생텍쥐페리");
        예제4_04 loveStory = new 예제4_04("춘향전");

        System.out.println(String.join(" ",littlePrince.title, littlePrince.title));
        System.out.println(loveStory.title+" "+loveStory.author);
    }
}
