package day_04;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {
         /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */
        /*
        arabacami
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime=scan.next().toLowerCase();
        int sayac=0;
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i)=='a'){
                sayac++;
            } else if (kelime.charAt(i)=='c') {
                break;

            }


        }
        System.out.println("Girdiğiniz kelimedeki ilk c harfine kadar ki a harfi sayisi :  "+sayac);
    }
}
