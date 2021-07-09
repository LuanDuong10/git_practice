package javabasic;

public class VongLapDoWhile {
    public static void main(String[] args) {
        int a = 2;
        int i = 12;
        do {
            System.out.println(a + " * " + i + " = " + (a * i));
            i++;
        } while (i < 11);
    }
}
