package oosProject.ch05;

public class prac03 {
    public static void main(String[] args) {
        Won2Dollar toDollar = new Won2Dollar(1200);
        toDollar.run();
    }
}

//원화 -> 달러
class Won2Dollar extends Converter{

    Won2Dollar(double ratio){
        this.ratio=ratio;
    }
    protected double convert(double src){
        return src/ratio;
    }
    protected String getSrcString(){
        return "원";
    }
    protected String getDestString(){
        return "달러";
    }
}