package ObjectClass;

import java.util.Scanner;

public class HinhTron {
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;

    public void nhapBanKinh() {
        System.out.println("Hay nhap vao ban kinh");
        Scanner sc = new Scanner(System.in);
        r = Float.parseFloat(sc.nextLine());
    }

    public void tinhChuvi() {
        cv = 2 * r * PI;
    }

    public void dienTich() {
        dt = PI * r * r;
    }

    public void inChuVi() {
        System.out.println("Chu vi hinh tron la: " + cv);
    }

    public void inDienTich() {
        System.out.println("Dien tich hinh tron la: " + dt);
    }
}
