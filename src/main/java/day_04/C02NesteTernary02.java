package day_04;

import java.util.Scanner;

public class C02NesteTernary02 {
     /*
        Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
     */
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("Lütfen bir karakter giriniz");
         char ch=scan.next().charAt(0);
         Object sonuc= (ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')? (ch>='a'&&ch<='z'?"kucuk harf": "buyuk harf"): "harf değil";

         System.out.println(sonuc);
     }
}
