package Day_02;

import java.util.Scanner;

public class C02_MethodCreation {
    //kullanıcıdan fahrenheit cinsi bir deger girmesini isteyin.
    // Fahrenheit değeri, Celsius değere çeviren method yazınız.
    // formül: c = (f-32)/1.8

    //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Lütfen fahrenheit degeri giriniz :");
        double fahrenheit=input.nextDouble();
        System.out.println("fahrenheit = " + fahrenheit);

        //main method icinden method olustururken
        //methoda bir isim verelim,parantez acalım
        //method parantezinin içine argument yazarız
        double celsius=cevirme(fahrenheit);//method parantezinin içine neyi degiştireceksek onu yazıyoruz
        System.out.println("celsius = " + celsius);
    }

    public static double cevirme(double fahrenheit) {
        return (fahrenheit-32)/1.8;
    }


}
