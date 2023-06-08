package day_06;

import java.util.Arrays;

public class C02_Arrays {
    /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' elemanları bulan bir kod yazınız.

        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};

        output: min:-90, max:10001, ikincimax: 8787

       */
    public static void main(String[] args) {
        int[] arr={ 100, 10001, -90, 845, 8787, 898, 0, 1};
        //int arr[] = iki şekilde de olur.
        //sort meyhodu arrayi natural order a gore siralar.
        //natural order yani alfabetik ve kucukten buyuge siralama
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("minimum : "+arr[0]);//Array in minimum elemani

        System.out.println("maximum : "+arr[arr.length-1]);//Array in son elemani yani max elemani alinir
        System.out.println("2. maximum : "+arr[arr.length-2]);//Array in 2. en büyük sayisi


    }
}
