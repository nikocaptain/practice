package day_05;

import java.util.Scanner;

public class C02_NesteForLoop {
    public static void main(String[] args) {
       /*
    Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
    ve ardından aşağıdaki şekli bu sayıya göre yazdırın:

    örnegin: Satır Sayısı 4 icin;

     1
     2 3
     4 5 6
     7 8 9 10


     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen satir sayisi giriniz:");
        int sayi= scan.nextInt();
        int sayac=1;
        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(sayac+" ");
                sayac++;

            }
            System.out.println();

        }
    }
}
