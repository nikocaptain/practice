package day_05;

import java.util.Arrays;
import java.util.Scanner;

public class C06_Arrays {
    public static void main(String[] args) {
        // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
// ve bu rakamları bir array'e assiyn ediniz. Olusturdugunuz array'i yazdırınız
// Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız
// Ortalamadan daha buyuk olan array elemanlarını yazdırınız
        int arr[]=new int[4];

        Scanner scan=new Scanner(System.in);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));//[0, 0, 0, 0]
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1)+". sayiyi giriniz");
            arr[i]=scan.nextInt();

        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        double toplam=0;
        double ortalama=0;
        for (int w:arr){
            toplam=toplam+w;

        }
        ortalama=toplam/arr.length;
        System.out.println(ortalama);
        for (int w: arr){
            if (w>ortalama){
                System.out.print(w+" ");
            }
        }




    }
}
