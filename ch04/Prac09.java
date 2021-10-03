package oosProject.ch4;

public class Prac09 {
    public static void main(String[] args) {
        int[] arr1 = {1,5,7,9};
        int[] arr2 = {3,6,-1,100,77};
        int[] arr3 = ArrayUtil.concat(arr1,arr2);
        ArrayUtil.print(arr3);
    }
}

class ArrayUtil{
    public static int[] concat(int[] a, int[] b){
        /* 배열 a와 b를 연결한 새로운 배열 리턴*/
        int[] newArr = new int[a.length+b.length];
        int newArrIndex=0;
        for(int i=0;i<a.length;i++){
            newArr[newArrIndex++]=a[i];
        }
        for(int i=0;i<b.length;i++){
            newArr[newArrIndex++]=b[i];
        }
//        for(int i=0;i<a.length;i++){
//            c[i]=a[i];
//        }
//        for(int i=a.length;i<a.length+b.length;i++){
//            c[i]=b[i-a.length];
//        }
        return newArr;
    }
    public static void print(int[] a){
        /* 배열 a 출력*/
        System.out.print("[ ");
       for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
       }
        System.out.println("]");
    }
}
