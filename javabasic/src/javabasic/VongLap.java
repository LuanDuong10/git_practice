package javabasic;

public class VongLap {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            count += i;
        }
        System.out.println("Tổng các số từ 1 đến 10: " + count);
    }
}
