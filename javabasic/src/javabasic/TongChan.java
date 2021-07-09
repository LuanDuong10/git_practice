package javabasic;

import java.util.Scanner;

public class TongChan {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên bất kỳ từ bàn phím: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i < n; i += 2) {
            count += i;
        }
        System.out.println("Tổng các số chẵn của bạn đã nhập là: " + count);
    }
}
