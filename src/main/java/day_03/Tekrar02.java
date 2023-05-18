package day_03;

import java.util.Scanner;

public class Tekrar02 {
    //kullanıcıdan pozitif bir sayı alınız
    //verılen sayının 3 veya daha cok basamaklı olup olmadıgını  ternary ile kontrol eden
    // ve yazdıran bir method olusturun
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayi giriniz......");
        int sayi = scan.nextInt();

        basamakhesapla(sayi);

    }

    private static void basamakhesapla(int sayi) {

        String result=sayi>99 ? "3 basamaklı" : "3 basamaklı degil";
        System.out.println(result);
    }
}
