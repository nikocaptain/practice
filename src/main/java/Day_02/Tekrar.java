package Day_02;


import java.util.Scanner;

public class Tekrar {
    //kullanıcıdan fahrenheit cinsi bir deger girmesini isteyin.
    // Fahrenheit değeri, Celsius değere çeviren method yazınız.
    // formül: c = (f-32)/1.8

    //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen fahrenheit degerini giriniz:  ");

        double fahrenheit=input.nextDouble();
        donustur(fahrenheit);
    }

    private static  void donustur(double fahrenheit) {
        double celsius =(fahrenheit-32)/1.8;
        System.out.println("celsius = " + celsius);
    }


}
