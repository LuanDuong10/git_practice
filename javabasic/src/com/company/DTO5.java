package com.company;

import java.util.Scanner;

public class DTO5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào số nguyên bất kỳ từ bàn phím");
        n = sc.nextInt();
//        System.out.println("Tổng số chẵn trong dãy số, khi bạn nhập là: " + soChan(n));
        System.out.println("Tổng số chẵn trong dãy số, khi bạn nhập là: " + soLe(n));
    }

    public static int soChan(int a) {
        int count = 0;
        if (a < 2) {
            System.out.println("Số bạn nhập không đúng");
        } else {
            for (int i = 2; i <= a; i++) {
                if (i % 2 == 0) {
                    count += i;
                }
            }
        }
        return count;
    }

    public static int soLe(int b) {
        int sum = 0;
        if (b < 1) {
            System.out.println("Số bạn nhập không đúng định dạng");
        } else {
            for (int i = 1; i <= b; i += 2) {
                sum += i;
            }
        }
        return sum;
    }
}
