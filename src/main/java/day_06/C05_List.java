package day_06;

import java.util.ArrayList;
import java.util.List;

public class C05_List {
    public static void main(String[] args) {
        /*
          İki Array'de ortak bulunan elementleri bir list'e ekleyiniz ve list'i yazdırınız.
          (case sensitivity olmadan)
        String[] arr = {"John","Brad","Angel","Sofia","Emily"};

        String[] brr = {"sofia","brad","grace","emily","hazel"};



          Output : [Brad,Sofia,Emily]

         */
        String[] arr = {"John","Brad","Angel","Sofia","Emily"};

        String[] brr = {"sofia","brad","grace","emily","hazel"};

        List<String> ortakİsimler=new ArrayList<>();//List yerine ArrayList de yazilabilir
        for (int i = 0; i <arr.length ; i++) {//arr'deki elemanlar tek tek gelecek
            for (int j = 0; j <brr.length ; j++) {//brrdeki elemanlar tek tek gelecek
                if (arr[i].equalsIgnoreCase(brr[j])){
                    ortakİsimler.add(arr[i]);
                    //ortakİsimler.add(brr[j]); //bu sekilde de olur.
                }
            }
        }
        System.out.println(ortakİsimler);//[Brad, Sofia, Emily]
    }
}
