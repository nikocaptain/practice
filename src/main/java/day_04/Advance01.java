package day_04;

import java.text.DecimalFormat;

public class Advance01 {
    public static void main(String[] args) {
        /*
     İsim, soyisim, yaş, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
            İsim: ...
            Soyisim: ...
            Yaş: ...
            Boy: ...
            Kilo: ...
     Not: Sadece bir adet "System.out.println(); kullanınız.
     */
        /*
        String isim="Niyazi";
        String soyIsim="Bölükbaşı";
        int yas=33;
        double boy=1.78;
        int kilo=75;
        System.out.println("isim: "+isim+"\nsoyisim: "+soyIsim+"\nyas: "+yas+"\nboy: "+boy+"\nkilo: "+kilo);
         */


        double sayi1 = 23.4;
        double sayi2 = 24.0;
        double sayi3 = 12;
        double sayi4 = 450.3;
        double sayi5 = 23000;
        double toplam = sayi1 + sayi2 + sayi3 + sayi4 + sayi5;
        double ortalama = toplam / 5;
        DecimalFormat df=new DecimalFormat();
        String yeniFormat = df.format(ortalama);
        System.out.println("Sayıların ortalaması: " + yeniFormat);

        /*
       Hipotenüs hesaplayan bir kod yazınız
       Hipotenös formülü: Karekök(a*a + b*b)
    */
        double a=-5;
        a=Math.pow(a,3);
        System.out.println(a);
        double b=9;
        b=Math.sqrt(b);
        System.out.println(b);
        double hipotenus=Math.sqrt(a*a+b*b);
        System.out.println(hipotenus);

        System.out.println("--------------------");
        /*
        Bir tamsayıyı basamaklarına ayıran bir kod yazınız.
        İpucu: / ve % kullanınız
        Sayı: 12345
        Çıktı: 1
               2
               3
               4
               5
    */
        int sayi=12345;
        int sayi11=sayi%10;//5
        int sayi22=sayi/10%10;//4
        int sayi33=sayi/100%10;//3
        int sayi44=sayi/1000%10;//2
        int sayi55=sayi/10000;//1
        System.out.println(sayi55+"\n"+sayi44+"\n"+sayi33+"\n"+sayi22+"\n"+sayi11);


    }
}
