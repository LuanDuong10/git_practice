package javabasic;

import java.util.Scanner;

public class CuPhap {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        int result;
        try {
            result = a / b;
        } catch (Exception e) {
            result = 10;
        }
        System.out.println("result = " + result);
    }
}
