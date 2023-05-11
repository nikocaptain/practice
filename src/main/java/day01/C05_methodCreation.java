package day01;

public class C05_methodCreation {


    //iki sayının kareleri toplamını bulan ve yazdıran bır method olusturunuz


    public static int karetoplam(int a,int b){
        return (a*a)+(b*b);
    }

    public static void main(String[] args) {
       int kareleriToplami= karetoplam(8,10);

        System.out.println("kareleriToplami = " + kareleriToplami);


    }
}
