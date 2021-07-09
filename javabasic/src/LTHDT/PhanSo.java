package LTHDT;

import java.util.Scanner;

public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo() {
        tu = 0;
        mau = 1;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    //TimUocSoChungLonNHat
    private int timUSCLN(int a, int b) {
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    //Ham kiem tra Ps toi gian hay chua
    public boolean kiemTraPSToiGian() {
        if (timUSCLN(tu, mau) == 1) {
            return true;
        }
        return false;
    }

    //Ham toi gian PS
    public void toiGianPS() {
        int x = timUSCLN(tu, mau);
        tu /= x;
        mau /= x;
    }

    //NhapPs
    public void nhapPS(Scanner sc) {
        int a;
        int b;
        do {
            System.out.print("\tNhap vao tu so: ");
            a = Integer.parseInt(sc.nextLine());
            System.out.print("\tNhap vao mau so: ");
            b = Integer.parseInt(sc.nextLine());

            //kiem tra
            if (b == 0) {
                System.out.println("Mau so phai # 0. Hay nhap lai");
            } else {
                this.tu = a;
                this.mau = b;
            }
        }
        while (b == 0);
    }

    //hienthiPS
    public void hienthiPS() {
        if (this.tu * this.mau < 0) {
            System.out.print("\t-" + Math.abs(this.tu) + "/" + Math.abs(this.mau));
        } else {
            System.out.print("\t" + Math.abs(this.tu) + "/" + Math.abs(this.mau));
        }
    }

    //congphanso
    public PhanSo congPS(PhanSo ps2) {
        int a = tu * ps2.mau + ps2.tu * mau;
        int b = mau * ps2.mau;
        return new PhanSo(a, b);
    }

    //truphanso
    public PhanSo truPS(PhanSo ps2) {
        int a = tu * ps2.mau - ps2.tu * mau;
        int b = mau * ps2.mau;
        return new PhanSo(a, b);
    }

    //nhanphanso
    public PhanSo nhanPS(PhanSo ps2) {
        int a = tu * ps2.tu;
        int b = mau * ps2.mau;
        return new PhanSo(a, b);
    }

    //chiaphanso
    public PhanSo chiaPS(PhanSo ps2) {
        int a = tu * ps2.mau;
        int b = mau * ps2.tu;
        return new PhanSo(a, b);
    }

}
