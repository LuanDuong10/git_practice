package examplejavacore;

import java.util.Scanner;

public class BT03 {
    public static void main(String[] args) {
        System.out.println("Nhap nam hien tai cua ban: ");
        Scanner sc = new Scanner(System.in);
        int year = Integer.parseInt(sc.nextLine());
        if (checkNamNhuan(year) == true) {
            System.out.println("Nam ban nhap la nam nhuan");
        } else {
            System.out.println("Nam ban nhap khong phai nam nhuan");
        }
    }

    public static boolean checkNamNhuan(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
