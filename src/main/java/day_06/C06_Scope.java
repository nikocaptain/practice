package day_06;

public class C06_Scope {

        /*
        scope kapsam demektir. java için scope variablelarinin gecerli oldugu yer anlamina gelir.

        4 cesit scope vardir
        1-static variable==class variable
        2-instance variable==object variable
        --static ve instance variable lar class level da olusturulur
        3-local variable==method icinde olusturdugumuz variabler lardır
        4- loop variable==loop icinde olusturdugumuz variable lardir.
         */
    static int staticSayi;//class level da olusturdugumuz variable lara deger atamasi
                          // yapmadigimiz zaman java bunlara default deger atar.

    int instanceSayi;




        public static void main(String[] args) {


            int localSayi=4;
            for (int i = 0; i < 2; i++) {
                System.out.print(i);
            }
           // System.out.println(i);
            System.out.println();

            System.out.println(staticSayi);
            //static bir variable yani class variable class icinde kullanilabilir.
            //System.out.println(instanceSayi);
            //instance yani object variable objeye bagli oldugu icin static bir methodda direk kullanilamaz.

            C06_Scope obj=new C06_Scope();
            System.out.println(obj.instanceSayi);
           // int a=obj.instanceSayi;
    }
}
