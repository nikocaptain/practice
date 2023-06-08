package day_06;

import java.util.Arrays;

public class Tekrar01 {
    public static void main(String[] args) {
        // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
        //yeni bir array olusturmadan varolan arrayın işaretleri degişsin
        // input : 1,2,-3,4,-5,-6
        // output :-1,-2,3,-4,5,6
        // 1. yol==>>int arr[]=new int[6];
        int [] arr={1,2,-3,4,-5,-6};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*-1;
        }
        System.out.println(Arrays.toString(arr));

    }
}
