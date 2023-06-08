package day_06;

import java.util.Arrays;

public class Tekrar02 {
    public static void main(String[] args) {
        /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' elemanları bulan bir kod yazınız.

        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};

        output: min:-90, max:10001, ikincimax: 8787

       */
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("minimum deger : "+arr[0]);
        System.out.println("maksimum deger : "+arr[arr.length-1]);
        System.out.println("ikinci maksimum deger : "+arr[arr.length-2]);
    }
}
