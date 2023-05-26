package day_04;

import java.util.Scanner;

public class Advance02 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan adını, ikinci adını ve soyadını tek bir satırda girmesini isteyin.
        Ardından ikinci adın ve soyadın ilk karakterini yazdırın.
        Örnek: Mark Hansel Twain ==> HT
    */
        Scanner scan=new Scanner(System.in);
        System.out.println(" isim gir");
        String isim= scan.nextLine();
        char ikinci=isim.charAt(isim.indexOf(" ")+1);
        System.out.println("ikinci = " + ikinci);
        char son=isim.charAt(isim.lastIndexOf(" ")+1);
        System.out.println("son = " + son);

    }
}
