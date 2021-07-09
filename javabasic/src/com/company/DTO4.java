package com.company;

import java.util.Scanner;

public class DTO4 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào số nguyên bất kỳ từ bàn phím");
        n = sc2.nextInt();

        if (n < 1) {
            System.out.println("Số bạn nhập không đúng");
        } else {
            int count = 0;
            for (int i = 1; i <= n; i+=2) {
                if (i % 2 == 0) {
                    System.out.println("Số nhập là");
                } else {
                    count += i;
                }
            }
            System.out.println("Tổng các số chẵn bạn nhập vào là: " + count);
        }
    }
}
