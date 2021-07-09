package javabasic;

import java.util.Scanner;

public class VongLapWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay so nguyen bat ky tu ban phim");
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (n < 0) {
                    System.out.println("Hay nhap so lon 0: ");
                } else {
                    System.out.println("So ban nhap la: " + n);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Ban hay nhap so tu ban phim");
            }
        }
    }
}
