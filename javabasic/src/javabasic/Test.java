package javabasic;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = Integer.parseInt(sc.nextLine());
        if (isSoNguyenTo(n)) {
            System.out.println(n + " La so nguyen to");
        } else {
            System.out.println(n + " Khong la so nguyen to");
        }

    }

    public static boolean isSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
