package Day_02;

public class C01_Odev {

    public static void  karetoplam(int a,int b){//method parantez içine method da kullanacağımız "variable"ları tanımlıyoruz.
        int sonuc=(a*a)+(b*b);
        System.out.println("sonuc = "+sonuc);

    }

    public static void main(String[] args) {

        karetoplam(7,7);//burada parantez içindeki degerlere agument denir

    }
}
