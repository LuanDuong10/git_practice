package javabasic;

import java.util.Scanner;

public class tongChan3 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số nguyên bất kỳ từ bàn phím");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tongChan3 tong = new tongChan3();
        int a = tong.sum(n);
        System.out.println("Tổng các số chẵn trong dãy số n là: " + a);

    }


    public int sum(int a) {
        int count = 0;
        for (int i = 2; i < a; i += 2) {
            count += i;
        }
        return count;
    }
}
