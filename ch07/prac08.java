package oosProject.ch07;

import java.util.*;

public class prac08 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Map<String, Integer> hashMap = new HashMap<String,Integer>();
        System.out.println("** 포인트 관리 프로그램입니다 **");

        while(true){
            System.out.print("이름과 포인트 입력>> ");
            String info = in.nextLine();
            if(info.equals("그만"))
                break;
            StringTokenizer st = new StringTokenizer(info," ");
            String name = st.nextToken().trim();
            int point = Integer.parseInt(st.nextToken().trim());
            if(hashMap.get(name)!=null){
                int pastPoint = hashMap.get(name);
                hashMap.replace(name,pastPoint+point);
            }
            else{
                hashMap.put(name,point);
            }
            Set<String> keys = hashMap.keySet();
            Iterator<String> it = keys.iterator();
            while(it.hasNext()){
                //System.out.print("("+it.next()+","+hashMap.get(it.next())+")" );
                //위의 코드처럼 작성하면 오류 발생 => 왜 발생하는거지????

                String n = it.next();
                int p = hashMap.get(n);
                System.out.print("("+n+","+p+")" );
            }
            System.out.println();
        }
    }
}
