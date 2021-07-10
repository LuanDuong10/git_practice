package com.company;

import java.util.Scanner;

public class DT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử trong mảng, từ bàn phím: ");
        int a;
        a = sc.nextInt();
        int[] array = new int[a];
        System.out.println("Tổng các phần tử trong mảng, khi bạn nhập trước đó là: " + tinhTong(array));
    }

    public static int tinhTong(int[] n) {
        int count = 0;
        for (int i = 1; i < n.length; i++) {
            count += n[i];
        }
        return count;
    }
}
