package day_05;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        // Kullanıcıdan sisteme bir sayi girmesini isteyiniz
        // kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz
        //or: 5!=1*2*3*4*5

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen faktöriyeli alinacak sayiyi giriniz...");
        int sayi= scan.nextInt();
        int multiply=1;
        int i=1;
        while (i<=sayi){
            multiply=multiply*i;
            i++;
        }
        System.out.println(sayi+"! = "+multiply);
    }
}
