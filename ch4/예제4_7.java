package oosProject.ch4;

public class 예제4_7 {
    public static void main(String[] args) {
        Book[] book = new Book[2];
        for(int i=0;i< book.length;i++){
            book[i]=new Book();
        }
    }
}

class Book{
    String title,author;
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
}
