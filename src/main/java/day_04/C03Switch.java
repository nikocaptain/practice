package day_04;

import java.util.Scanner;

public class C03Switch {
    // Kullanıcıdan uc basamaklı bir sayı sisteme girmesini isteyiniz
// Bu sayıyı okunuşuna çeviren bir kod yazınız.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayi giriniz:");
        int num= scan.nextInt();

        //eger kullanıcı sisteme 3 basamaklı pozitif bir sayı girmediyse hata mesajı versin
        if(num<100||num>999){// sayinin 3 bsmklı olmama durumunu kontrol edeceğiz

            System.out.println("Hatali Giriş sayi 3 basamakli olmali");
        }else {
            int birler=num%10;
            int onlar=num/10%10;
            int yuzler=num/100;

            switch (yuzler){
                case 1:
                    System.out.println("yüz");
                    break;
                case 2:
                    System.out.println("İkiyyüz");
                    break;
                case 3:
                    System.out.println("üçyüz");
                    break;
                case 4:
                    System.out.println("Dörtyüz");
                    break;
                case 5:
                    System.out.println("Beşyüz");
                    break;
                case 6:
                    System.out.println("Altiyüz");
                    break;
                case 7:
                    System.out.println("Yediyüz");
                    break;
                case 8:
                    System.out.println("Sekizyüz");
                    break;
                case 9:
                    System.out.println("Dokuzyüz");

                    break;
                default:
                    break;
            }
            switch (onlar){
                case 1:
                    System.out.println("On");
                    break;

                case 2:
                    System.out.println("Yirmi");
                    break;
                case 3:
                    System.out.println("Otuz");
                    break;
                case 4:
                    System.out.println("Kırk");
                    break;
                case 5:
                    System.out.println("Elli");
                    break;
                case 6:
                    System.out.println("Altmış");
                    break;
                case 7:
                    System.out.println("Yetmiş");
                    break;
                case 8:
                    System.out.println("Seksen");
                    break;
                case 9:
                    System.out.println("Doksan");
                    break;
                default:
                    break;


            }
            switch (birler){
                case 1:
                    System.out.println("Bir");
                    break;
                case 2:
                    System.out.println("İki");
                    break;
                case 3:
                    System.out.println("Üç");
                    break;
                case 4:
                    System.out.println("Dört");
                    break;
                case 5:
                    System.out.println("Beş");
                    break;
                case 6:
                    System.out.println("Altı");
                    break;
                case 7:
                    System.out.println("Yedi");
                    break;
                case 8:
                    System.out.println("Sekiz");
                    break;
                case 9:
                    System.out.println("Dokuz");
                    break;
                default:
                    break;

            }
        }
    }
}
