package oosProject.ch4;

public class Prac03 {
    public static void main(String[] args) {
        Song s = new Song("Dancing Queen", "ABBA",1978,"스웨덴");
        s.show();
    }
}

class Song{
    private String title;
    private String artist;
    private int year;
    private String country;

    Song(){
        this("","",0,"");
    }
    Song(String title, String artist, int year, String country){
        this.title=title;
        this.artist=artist;
        this.year=year;
        this.country=country;
    }

    void show(){
        System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
    }
}