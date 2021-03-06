package oosProject.ch05;

class Dictionary extends PairMap {
    private int set;
    public Dictionary(int num){
        keyArray = new String[num];
        valueArray = new String[num];
        set=0;
    }

    @Override
    public String get(String key) {
        for(int i=0;i< keyArray.length;i++){
            if(key.equals(keyArray[i])){
                return valueArray[i];
            }
        }
        return null;
    }

    @Override
    public void put(String key, String value) {
        for(int i=0;i<keyArray.length;i++){
            if(key.equals(keyArray[i])){     //주의사항:: 조건식을 key.equals(keyArray[i])로 작성시, NULLPointerException 발생
                valueArray[i]=value;
                return ;
            }
        }
        //기존에 key가 없는 경우
        keyArray[set]=key;
        valueArray[set]=value;
        set++;
    }

    @Override
    public String delete(String key) {
        for(int i=0;i< keyArray.length;i++){
            if(key.equals(keyArray[i])){
                String value = valueArray[i];
                keyArray[i]=null;
                valueArray[i]=null;
                return value;
            }
        }
        return null;
    }

    @Override
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
