package day01;

public class C01_Variables {


    public static void main(String[] args) {
        //Bir variable olustur, yazdır
        int yas = 32;
        System.out.println(yas);//ctrl+d ile satır alt alta cogaltılabilir
        System.out.println(yas);
        System.out.println(yas);
        System.out.println(yas);//variable dinamik olsun diye kullanılır
        int sayi = 12;
        System.out.println(sayi);//sayi=12 şeklinde yazdır.
        System.out.println("sayi = " + 12);//+ işareti arka arkaya yazdır demek veya etiketi ile birlikte yazdırmak denir.
        //syntax:variable data type+variable isim+atama operatörü+variable değer
        //ctrl alt l kodlarımızı düzenlemeye yarar
        //bir variable ı etiketiyle birlikte yazdırmanın kısa yolu= soutv
        System.out.println("sayi = " + sayi);
        System.out.println("yas = " + yas);
        // String bir variable oluşturalım
        String isim="inci";
        System.out.println("isim = " + isim);


        //Olusturdugun variable'ı farkli bir variable'a kopyala
        //yeni bir variable luşturacağım: benimyasim ve bu variable ın degeri yas veriable ına esit olsun
        int benimyasim= yas;
        System.out.println(benimyasim);

        String str1="Niyazi";
        System.out.println("str1 = " + str1);

        String str2=str1;
        String str3= String.valueOf(yas);
        System.out.println("str2 = " + str2);
        //camelCase
        //PAscalCase
        //snake_case
        //kebab-case


        //Aynı satırda coklu variable deklare et

        int yil=2023, ay=5, gun=15;
        System.out.println(yil);
        System.out.println(ay);
        System.out.println(gun);
        //Bir variable degerini guncelle

        str1="Inci";
        System.out.println("str1 = " + str1);
        //java yukarıdan asagı ve soldan saga calisir.

        //Degişkenleri(variable) yazdır

        //Bir variable deklere et : x

        double x;
        //Bir variable baslat : y
        //başlat demek atama yap demektir.
        double y=12.5;
        System.out.println("y = " + y);
        //Başka bir variable başlat : z

        double z=15.5;
        System.out.println("z = " + z);
        //x degişkenini y degişkeni ile başlat

        x=y;//bir variable bir scope(main method) da sadece bir kez deklare edilir.
        //Variable y'i guncelle
        System.out.println("x = " + x);
        y=22.5;//ondalıklı sayılarda nokta kullanılır.
        System.out.println("y = " + y);

        //Degişkenleri yazdır



    }
}
