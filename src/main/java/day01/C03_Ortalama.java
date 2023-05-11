package day01;

public class C03_Ortalama {
    /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
     */


    public static void main(String[] args) {
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

        //double data türünde ismi toplam olan bir variable olusturalim
        // ve bu variable yazdıgımız 5 sayinin toplamini assign edelim(atayalim).

        double toplam=num1+num2+num3+num4+num5;//numeric datalarda "+" işareti toplama işlemi yapar.

        System.out.println((num1+num2+num3+num4+num5)/5);

        System.out.println("toplam = " + toplam);

        double ortalama= toplam/5;

        System.out.println("ortalama = " + ortalama);


    }
}
