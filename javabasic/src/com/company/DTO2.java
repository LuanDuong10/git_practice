package com.company;

import java.util.Scanner;

public class DTO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.println("Nhap gia tri so a: ");
        a = sc.nextInt();
        System.out.println("Nhap gia tri so b: ");
        b = sc.nextInt();

        if (a == 0) {
            System.out.println("Phương trình vô nghiệm ");
        } else {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            }
            if (b != 0) {
                float x;
                x = b / a;
                System.out.println("Phương trình có nghiệm là: " + x);
            }
        }


    }
}
