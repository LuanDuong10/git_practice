package javabasic;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Nhap vao so nguyen bat ky tu ban phim");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int check = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("So ban nhap la so nguyen to");
        } else {
            System.out.println("So ban nhap khong phai la so nguyen to");
        }

    }
}
