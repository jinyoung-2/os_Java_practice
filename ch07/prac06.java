package oosProject.ch07;

import java.util.*;

class Location{
    private String city;
    private int longitude;   //경도
    private int latitude;    //위도

    public Location(String city, int longitude, int latitude){
        this.city=city;
        this.longitude=longitude;
        this.latitude=latitude;
    }

    public void Print(){
        System.out.println(city + "\t" + longitude + "\t" + latitude);
    }
}

public class prac06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String,Location> hashmap = new HashMap<>();
        System.out.println("도시, 경도, 위도를 입력하세요.");
        for(int i=0;i<4;i++){
            System.out.print(">> ");
            String input=in.nextLine();
            StringTokenizer t = new StringTokenizer(input,",");
            String city = t.nextToken().trim();
            int longitude = Integer.parseInt(t.nextToken().trim());
            int latitude = Integer.parseInt(t.nextToken().trim());
            hashmap.put(city,new Location(city,longitude,latitude));
        }

        Set<String> keySet = hashmap.keySet();
        Iterator<String> it = keySet.iterator();
        System.out.println("--------------------------");
        while(it.hasNext()){
            String key = it.next();
            Location l = hashmap.get(key);
            l.Print();
        }
        System.out.println("--------------------------");

        while(true){
            System.out.print("도시 이름 >> ");
            String city = in.next();
            if(city.equals("그만"))
                break;
            if(hashmap.get(city)==null)
                System.out.println(city + "는 없습니다.");
            else
                hashmap.get(city).Print();
        }
        in.close();
    }
}
