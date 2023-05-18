package day_03;

import java.util.Scanner;

public class Tekrar01 {
      /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */
      public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          System.out.println("lütfen ad soyad giriniz");
          String adSoyad=scan.nextLine();
          int spaceIndex=adSoyad.indexOf(" ");
          String ad=adSoyad.trim().substring(0,spaceIndex);
          char adIlkHarf=ad.toUpperCase().charAt(0);
          String adSon=ad.toLowerCase().substring(1);


          String soyad=adSoyad.trim().substring(spaceIndex+1);
          char soyadIlkHarf=soyad.toUpperCase().charAt(0);
          String soyadSon=soyad.toLowerCase().substring(1);
          System.out.println(adIlkHarf+adSon);
          System.out.println(soyadIlkHarf+soyadSon);
      }
}
