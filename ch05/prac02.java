package oosProject.ch05;

public class prac02 {
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2",32,2048);
        iptv.printProperty();
    }
}

class IPTV extends ColorTV{
    private String ip;
    public IPTV(String ip,int size,int color){
        super(size,color);  //ip보다 뒤에 선언될경우 오류 발생 check
        this.ip=ip;
    }
    @Override
    protected void printProperty(){
        System.out.println("나의 IPTV는 "+ip+" 주소의 ");
        super.printProperty();      //중요 Point:: super를 이용해 부모 클래스 메서드 호출가능
    }
}
