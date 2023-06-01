package day_04;

import java.util.Scanner;

public class Atm02 {
    public static void main(String[] args) {
        String kullaniciAdim="Niyazi";
        String sifrem="pwd";
        int bakiye=1000;

        Scanner scan =new Scanner(System.in);

        int i=1;
        do {
            System.out.println("lütfen kullanici adini giriniz");
            String kullanici= scan.next();
            System.out.println("şifrenizi giriniz");
            String sifre=scan.next();

        if (kullanici.equals(kullaniciAdim)&&sifre.equals(sifrem)){
            System.out.println("giriş başarılı");
            System.out.println("yapmak istediğiniz işlemi tuşlarmısınız : ");
            System.out.println(" para yatirmak için 1 \n para çekmek için 2\n çıkış için 3");
            int sayi= scan.nextInt();
            switch (sayi){
                case 1:

                    System.out.println("yatirmak istediğiniz miktari giriniz:");
                    int yatirilanMiktar= scan.nextInt();
                    bakiye=bakiye+yatirilanMiktar;
                    System.out.println("yeni bakiyeniz : "+bakiye);
                    break;
                case 2:
                    System.out.println(bakiye+ " TL bakiyeniz vardır. çekmek istediğiniz miktari giriniz");
                    int cekilenMiktar=scan.nextInt();
                    if (cekilenMiktar>bakiye){
                        System.out.println("lütfen paranız kadar çekin");
                    }else {
                        bakiye=bakiye-cekilenMiktar;
                        System.out.println("bakiyeniz "+bakiye);
                    }break;


            }


        }else {
            System.out.println("hatalı giriş");
        }
        i++;
    }while (true);

    }
}
