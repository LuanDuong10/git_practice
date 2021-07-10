package com.company;

import java.util.Scanner;

public class DTO3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double a, b, c;
        System.out.println("Nhập vào số a từ bàn phím: ");
        a = sc1.nextInt();
        System.out.println("Nhập vào số b từ bàn phím: ");
        b = sc1.nextInt();
        System.out.println("Nhập vào số c từ bàn phím: ");
        c = sc1.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình có nghiệm là: " + (-b / c));
            }
        } else {
            double detal;
            detal = b * b - (4 * a * c);
            if (detal < 0) {
                System.out.println("Phương trình vô nghiệm");
            }
            if (detal == 0) {
                System.out.println("Phương trình có nghiệm kép: " + -b / (2 * a));
            }
            if (detal > 0) {
                double x1, x2;
                x1 = (-b + Math.sqrt(detal)) / (2 * a);
                x2 = (-b - Math.sqrt(detal)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt: " + x1 + " | " + x2);
            }
        }

    }
}
