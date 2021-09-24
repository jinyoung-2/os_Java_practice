package oosProject.ch4;

import java.util.Scanner;

public class 예제4_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Book[] book = new Book[2];
        for(int i=0;i< book.length;i++){
            System.out.print("제목>>");
            String title = in.nextLine();
            System.out.print("저자>>");
            String author = in.nextLine();
            book[i]=new Book(title,author);
        }
        for(int i=0;i< book.length;i++){
            System.out.print("("+book[i].title+","+book[i].author+")");
        }
        in.close();
    }
}

class Book{
    String title,author;
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
}
