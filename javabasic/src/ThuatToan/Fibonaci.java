package ThuatToan;

import java.util.Scanner;

public class Fibonaci {
    public static long dayFibonaci(int n) {
        if (n < 3) {
            return 1;
        }
        return dayFibonaci(n - 1) + dayFibonaci(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Fibonaci(" + i + ") = " + dayFibonaci(i));
        }
    }
}
