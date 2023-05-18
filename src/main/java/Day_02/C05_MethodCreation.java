package Day_02;



public class C05_MethodCreation {
    public static void main(String[] args) {
         /*
        1- Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */
     int sayi1=10;
     int sayi2=20;
        System.out.println("swaptan önce  :  "+sayi1);
        System.out.println("swaptan önce  :  "+sayi2);
       swaplaYazdir(sayi1,sayi2);

       //Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP)
        //        bir program yaziniz

        int x=15;
        int y=20;
        System.out.println("swaptan önce x : "+x);
        System.out.println("swaptan önce y : "+y);
        tekrar(x,y);



    }

    private static void tekrar(int x, int y) {
        int z;
        z=x;
        x=y;
        y=z;
        System.out.println("swaptan sonra : "+x);
        System.out.println("swaptan sonra  .  "+y);
    }


    private static void swaplaYazdir(int sayi1, int sayi2) {

      int sayi3;
      sayi3=sayi1;
      sayi1=sayi2;
      sayi2=sayi3;
        System.out.println("swaptan sonra  :  "+sayi1);
        System.out.println("swaptan sonra  :  "+sayi2);//

    }
}
