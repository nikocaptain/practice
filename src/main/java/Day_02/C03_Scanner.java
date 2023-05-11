package Day_02;

import java.util.Scanner;

public class C03_Scanner {
    //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
    //yani alınan iki sayının kareleri esıt ıse true, degıl ıse false döndürsün

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz : ");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz : ");
        int sayi2= scan.nextInt();
        boolean esitmi=KarelerEsitMi(sayi1,sayi2);
        System.out.println("esitmi = " + esitmi);
    }

    public static boolean KarelerEsitMi(int sayi1,int sayi2){
        boolean sonuc= (sayi1*sayi1)==(sayi2*sayi2);
        return sonuc;
    }
}
