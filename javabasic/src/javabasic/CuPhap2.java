package javabasic;

import java.util.Scanner;

public class CuPhap2 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so nguyen tu ban phim");
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine());
                System.out.println("So ban nhap la: " + n);
                break;
            } catch (Exception e) {
                System.out.println("Ban hay vao 1 so nguyen");
            }
        }
    }
}
