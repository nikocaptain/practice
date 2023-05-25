package day_04;

import java.util.Scanner;

public class C01NestedTernary {
    public static void main(String[] args) {
         /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("iki tane sayi giriniz");
        int a= scan.nextInt();
        int b= scan.nextInt();
        System.out.println("sayi1  : "+a);
        System.out.println("sayi2  : "+b);
        Object sonuc= a==b ? "Sayilar birbirine eşit" : (a>b) ? a : b ;//Object iki farklı data type olduğunda kulLanılır
        System.out.println(sonuc);
    }
}
