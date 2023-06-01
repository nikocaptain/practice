package day_05;

import java.util.Scanner;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        /*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile kullanıcıdan yüksekliği alınız)
    Atıldıktan sonra, atıldığı yüksekliğin 1/2 si kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi TOPLAM YOLU ve YERE VURMA SAYISINI bulan do while code blogu create ediniz.
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yukseklik giriniz...");
        double kullaniciGirisi = scan.nextDouble();
        double yukseklik = kullaniciGirisi;
        int vurmaSayisi = 0;
        double toplamYol = 0;
        //if (yukseklik<1){
           // System.out.println("1 den buyuk gir");
        //}else {
        do {
            toplamYol = toplamYol + yukseklik;
            vurmaSayisi++;
            toplamYol = toplamYol + (yukseklik / 2);
            yukseklik=yukseklik/2;
        } while (yukseklik >= 1);
        if (kullaniciGirisi<1){
            toplamYol=toplamYol-yukseklik;
        }else {
            toplamYol=toplamYol+yukseklik;
            vurmaSayisi++;
        }

        System.out.println("toplamYol = " + toplamYol);
        System.out.println("vurmaSayisi = " + vurmaSayisi);
    //}

    }
}
