package javabasic;

import java.util.Scanner;

public class TryCat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = 0;
        while (true) {
            try {
                System.out.println("Nhap vao diem cua sinh vien: ");
                n = Float.parseFloat(sc.nextLine());
                if (n > 0 && n <= 10) {
                    break;
                }
            } catch (Exception ex) {
                System.out.println("Hay nhap diem so cua sinh vien");
            }
        }
        System.out.println("Diem cua ban da nhap la: " + n);
    }
}
