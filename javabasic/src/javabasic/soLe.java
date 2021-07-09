package javabasic;

import java.util.Scanner;

public class soLe {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên bất kỳ từ bàn phím");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 1; i < n; i += 2) {

            count += i;
        }
        System.out.println("Tổng số lẻ trong các số b nhập là: " + count);
    }
}
