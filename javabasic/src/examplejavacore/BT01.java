package examplejavacore;

import java.util.Scanner;

public class BT01 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so nguyen bat ky tu ban phim");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        if (a > 0) {
            System.out.println("So ban nhap la so Duong: " + a);
        } else {
            System.out.println("So ban nhap la so am: " + a);
        }
    }
}
