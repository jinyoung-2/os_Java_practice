//package oosProject.ch05;
//
//class Dictionary extends PairMap{
//    void put(String key, String value){
//        boolean existKey=false;
//        for(int i=0;i< keyArray.length;i++){
//            if(key==keyArray[i]){       //기존에 key가 있는 경우
//                valueArray[i]=value;    //새로운 value로 수정
//                existKey=true;
//                break;
//            }
//        }
//        //기존에 key가 없는 경우 -> 새로 아이템 추가
//        if(!existKey){
//            keyArray[keyArray.length]=key;
//            valueArray[valueArray.length()]=value;
//        }
//    }
//
//    String delete(String key){
//
//    }
//
//    int length(){
//        return keyArray.length;
//        //return valueArray.length;
//    }
//}
