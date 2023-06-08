package day_06;

import java.util.ArrayList;
import java.util.List;

public class Tekrar05 {
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

        List<String> list=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < brr.length ; j++) {
                if (arr[i].equalsIgnoreCase(brr[j])){
                    //list.add(arr[i]);
                    list.add(brr[j]);
                }
            }
        }
        System.out.println(list);

    }
}
