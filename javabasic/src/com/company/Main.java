package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 2 so nguyen tu ban phim: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int c = a + b;
        System.out.println("Tong 2 so da nhap: " + c);

    }
}