package javabasic;

import java.util.Scanner;

public class DTO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (n <= 0) {
            System.out.println("Nhap so nguyen duong bat ky ban phim");
            n = Integer.parseInt(sc.nextLine());
            if (n > 0) {
                break;
            }
            System.out.println("So ban nhap la: " + n);
        }
    }
}
