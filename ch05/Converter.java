package oosProject.ch05;

import java.util.Scanner;

abstract class Converter {
    abstract  protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio; //비율

    public void run(){
        Scanner in = new Scanner(System.in);
        System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
        System.out.print(getSrcString()+"을 입력하세요>> ");
        double val = in.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: "+res+getDestString()+"입니다.");
        in.close();
    }
}
