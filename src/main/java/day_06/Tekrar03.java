package day_06;

import java.util.Arrays;
import java.util.Scanner;

public class Tekrar03 {
    public static void main(String[] args) {
        /*
        arr[3][2] luk bir mdarray olusturun
        Arrayın elemanlarını kullanıcıdan alın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int arr[][]={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */
        int[][] arr=new int[3][2];
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen array in sayilarini giriniz");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= scan.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(arr));
        int[] brr=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int toplam=0;
            for (int j = 0; j < arr[i].length; j++) {
                toplam=toplam+arr[i][j];
            }
            brr[i]=toplam;
        }

        System.out.println(Arrays.toString(brr));

    }
}
