package javabasic;

import java.util.Scanner;

public class TongChan2 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số nguyên từ bàn phím: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (i % 2 == 0) {
                count += i;
            }
        }
        System.out.println("Tổng số chẵn của bạn đã nhập là: " + count);
    }
}
