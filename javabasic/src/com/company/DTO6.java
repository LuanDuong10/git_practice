package com.company;

import java.util.Scanner;

public class DTO6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số nguyên bất kỳ từ bàn phím");
        n = sc.nextInt();
        System.out.println("Tổng các số nguyên tố là: " + tinhTong(n));
    }

    public static boolean isSONguyenTo(int a) {
        if (a < 3) {
            return true;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }

    public static int tinhTong(int b) {
        int count = 0;
        for (int i = 1; i <= b; i++) {
            if (isSONguyenTo(i)) {
                count += i;
            }
        }
        return count;
    }
}
