package oosProject.ch4;

public class Prac01 {
    public static void main(String[] args) {
        TV myTV = new TV("LG",2017,32);
        myTV.show();
    }
}

class TV{
    String company;
    int year;
    int size;

//    TV(){
//        this("LG",2000,16);
//    }
    TV(String company,int year,int size){
        this.company=company;
        this.year=year;
        this.size=size;
    }

    void show(){
        System.out.println(company+"에서 만든 "+year+"년형 "+size+"인치 TV");
    }
}