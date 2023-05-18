package day_03;

import java.util.Scanner;

public class C01_Substring {
    public static void main(String[] args) {
      /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */
       /*
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adınızı soyadınızı giriniz...");
        String name=scan.nextLine();
        char ad=name.toUpperCase().charAt(0);
        String ad1=name.split(" ")[0].substring(1).toLowerCase();

        String soyad=name.split(" ")[1];
        char soyilk=soyad.toUpperCase().charAt(0);
        String soykucuk=soyad.toLowerCase().substring(1);
        System.out.println(ad+ad1);
        System.out.println(soyilk+soykucuk);

        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adınızı soyadınızı giriniz...");
        String adSoyad=scan.nextLine();

        int spaceIndex= adSoyad.trim().indexOf(" ");
        String ad=adSoyad.trim().substring(0,spaceIndex);
        String soyAd=adSoyad.trim().substring(spaceIndex+1);
        System.out.println("ad = " + ad);
        System.out.println("soyAd = " + soyAd);


        char adilkharf= ad.toUpperCase().charAt(0);
        String adKalani= ad.toLowerCase().substring(1);


        char soyadIlkHarf =soyAd.toUpperCase().charAt(0);
        String soyadKalan=soyAd.substring(1).toLowerCase();

        System.out.println("Ad :  "+adilkharf+adKalani);
        System.out.println("Soyad : "+soyadIlkHarf+soyadKalan);




    }
}
