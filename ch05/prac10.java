package oosProject.ch05;

class Dictionary extends PairMap {
    private int set;
    public Dictionary(int num) {
        keyArray = new String[num];
        valueArray = new String[num];
        this.set = 0;
    }

    public String get(String key) {
        for(int i=0; i<keyArray.length; i++) {
            if(key.equals(keyArray[i])) {
                return valueArray[i];
            }
        }
        return null; // 원하는 key가 없다면 null 리턴
    }
    public void put(String key, String value) {
        for(int i=0; i<keyArray.length; i++) {
            if(key.equals(keyArray[i])) {
                keyArray[i] = key;
                valueArray[i] = value;
                return; // 중복된 key가 있다면 저장하고 함수 종료
            }
        }
        keyArray[set] = key;
        valueArray[set] = value;
        set++;
    }
    public String delete(String key) {
        for(int i=0; i<keyArray.length; i++) {
            if(key.equals(keyArray[i])) {
                String s = valueArray[i];
                keyArray[i] = null;
                valueArray[i] = null;
                return s;  // 삭제된 value 값 리턴
            }
        }
        return null; // 삭제된 것이 없다면 null 리턴
    }
    public int length() {
        return set;
    }
}

public class prac10 {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 "+dic.get("이재문"));
        System.out.println("황기태의 값은 "+dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 "+dic.get("황기태")); //삭제된 아이템 접근
    }

}
