package LTHDT;

import java.util.Scanner;

public class RunTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        PhanSo psTong = new PhanSo();
        PhanSo psNhan = new PhanSo();
        PhanSo psChia = new PhanSo();
        PhanSo psToiGian = new PhanSo();

        //Nhap PS
        System.out.println("Nhap vao Phan So thu nhat: ");
        ps1.nhapPS(sc);
        System.out.println("Nhap vao Phan So thu 2: ");
        ps2.nhapPS(sc);

        //tinh tong 2 phan so
        psTong = ps1.congPS(ps2);
        //nhan 2 phan so
        psNhan = ps1.nhanPS(ps2);
        //nhan 2 phan so
        psChia = ps1.chiaPS(ps2);
//        toi gian phan so
        ps2.toiGianPS();
        //Hien thi phan so
        System.out.print("\nPhan so thu nhat la: ");
        ps1.hienthiPS();
        System.out.print("\nPhan so thu 2 la: ");
        ps2.hienthiPS();
        System.out.print("\nHien thi tong 2 phan so da Nhap: ");
        psTong.hienthiPS();
        System.out.print("\nHien thi phep nhan 2 phan so da Nhap: ");
        psNhan.hienthiPS();
        System.out.print("\nHien thi phep chia 2 phan so da Nhap: ");
        psChia.hienthiPS();
        //toi gian phan so
        System.out.print("\nHien thi toi gian phan so thu 2 la: ");
        ps2.toiGianPS();
    }
}
