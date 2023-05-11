package day01;

public class C02_KullaniciBilgileri {

     /*
         isim, soyisim, yas, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
            Isim: ...
            Soyisim: ...
            Yas: ...
            Boy: ...
            Kilo: ...
    Not: Sadece bir adet "System.out.println(); kullanınız.
    */

    public static void main(String[] args) {
        String isim="Niyazi";
        String soyisim="Bölükbaşı";
        int yas=33;
        double boy=178;
        double kilo=78;
        System.out.println("Isim: "+isim+" \nSoyisim: "+soyisim+" \nyas: "+yas+" \nBoy: "+boy+" \nKilo: "+kilo);

        // \n kısaltması sout içerisinde alt satıra yazdırır
    }

}
