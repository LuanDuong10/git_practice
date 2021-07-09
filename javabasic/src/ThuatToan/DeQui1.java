package ThuatToan;

import java.util.Scanner;

public class DeQui1 {

    public static void main(String[] args) {
        System.out.println("Nhap vao so nguyen bat ky tu ban phim ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        long m = tinhgiaiThua(n);
        System.out.println("Gia tri cua n nhap tu ban phim la: " + m);
    }

    public static long tinhgiaiThua(int n) {
        if (n == 0) {
            return 1;
        }
        return n * tinhgiaiThua(n - 1);
    }
}