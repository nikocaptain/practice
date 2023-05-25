package day_04;

import java.util.Scanner;

public class C05_Switch03 {
    public static void main(String[] args) {
       /*
       Kullanıcıdan yıl ve ay numarasını ayrı ayrı sisteme girmesini isteyiniz.
       Girilen ay numarasına göre ayin kaç gün çektigini yazdırınız.


       NOT: 1, 3, 5, 7, 8, 10, 12. aylar 31 gun çeker
            4, 6, 9, 11. aylar 30 gun çeker
            2. ay 4 yılda bir 29 gun ceker, diger yıllarda 28 gun ceker
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yıl giriniz");
        int yil = scan.nextInt();
        System.out.println("Lütfen 1-12 arası bir ay numrası giriniz :");
        int ay = scan.nextInt();

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("giriğiniz ay 31 gün çeker");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("giriğiniz ay 30 gün çeker");
                break;
            case 2:
                if (yil % 4 == 0) {
                    System.out.println("girdiğiniz ay 29 gun ceker");
                } else {
                    System.out.println("girdiğiniz ay 28 gun ceker");
                }
                break;
            default:
                System.out.println("ltfen geçerli bir ay giriniz");
        }
    }//kod hizalama için  ""ctrl+alt+L""   basıyoruz
}
