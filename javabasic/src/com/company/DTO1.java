package com.company;

import java.util.Scanner;

public class DTO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap gia tri so a: ");
        a = sc.nextInt();
        System.out.println("Nhap gia tri so b: ");
        b = sc.nextInt();
        int tong;
        tong = a + b;
        String Chuoi = "Kết quả là: " + tong;
        System.out.println(Chuoi);

    }
}
