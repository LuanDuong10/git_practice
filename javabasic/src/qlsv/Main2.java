package qlsv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(7);
        arrayList.add(20);
        arrayList.add(30);

        for (Integer o : arrayList) {
            System.out.println(o);
        }
        System.out.println("-----------------------");
        Collections.sort(arrayList);
        for (Integer o :
                arrayList) {
            System.out.println(o);
        }
        System.out.println("------------------");
        int max = Collections.max(arrayList);
        System.out.println(max);
        System.out.println("----------------");
        int min  = Collections.min(arrayList);
        System.out.println(min);
    }
}
    
