package day_03;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {
        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen birinci sayiyi giriniz :");
        int num1=scan.nextInt();
        System.out.println("lütfen ikinci sayiyi giriniz :");
        int num2= scan.nextInt();
        if (num1>num2){
            System.out.println("birinci sayi ikinci sayidan buyuktur..");

        }else {
            System.out.println("birinci sayi ikinci sayidan buyuk degildir...");
        }
    }
}
