package Day_02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C04_Scanner {

    /*
    Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz
    */

        /*
                  A
                 A A
                A A A
         */
        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            System.out.println("Lütfen bir karakter giriniz : ");
            char ch=scan.next().charAt(0);//Scanner objesinin nextchar diye bir methodu yok
                                        //bu yuzden kullanıcının girdigi datayı once string olarak alıyorum
                                        //daha sonra bu stringin 0. index ini karakter charAt(0) methodu ile alıyorum
            //String variablelarda index yapısı vardır ve index 0'dan baslar
            //charAt(0) -> sıfırıncı index yani ilk karakter demektir
            System.out.println("ch = " + ch);
            System.out.println("===============CEVAP===============");

            System.out.println("  "+ch);
            System.out.println(" "+ch+" "+ch);
            System.out.println(ch+" "+ch+" "+ch);
            System.out.println("ikinci yöntem");
            System.out.println("  "+ch+"  \n "+ch+" "+ch+" \n"+ch+" "+ch+" "+ch);
            // \n isareti bir alt satıra gecmeye yarar ! "" içinde yazılır
            //konsolda bosluk (space) yapmak için sout'un içinde space'i mutlaka "" içinde yazmalıyız




        }
}
