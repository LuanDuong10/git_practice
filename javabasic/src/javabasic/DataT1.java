package javabasic;

import java.util.Scanner;

public class DataT1 {
    public static void main(String[] args) {
        DataT1 b_dt = new DataT1();
//        int number = b_dt.checkInput();
//        float b_float = b_dt.checkInput();
//        double b_double = b_dt.checkInput();
//        System.out.println("number: " + number);
//        System.out.println("b_float: " + b_float);
//        System.out.println("b_double: " + b_double);
//        int b_so = b_dt.checkPositive();
//        System.out.println("b_so : " + b_so);
        int soAm = b_dt.checkNegative();
        System.out.println("Số âm bạn nhập là: " + soAm);
    }

    public int checkInput() { //check xem user co nhap so hay ko?
        int number = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Input number: ");
                number = Integer.parseInt(sc.nextLine());  //
                break;
            } catch (Exception ex) {
                System.out.println("Hãy nhập số từ bàn phím:");
            }
        }

        return number;
    }

    public int checkPositive() {
        int number = 0;
        Scanner sc1 = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Hãy nhập số lớn 0 từ bàn phím: ");
                number = Integer.parseInt(sc1.nextLine());
                if (number > 0) {
                    break;
                } else {
                    System.out.println("Bạn đã nhập số nhỏ hơn 0: ");
                }
            } catch (Exception e) {
                System.out.println("Hãy nhập số từ bàn phím");
            }
        }
        return number;
    }

    public int checkNegative() {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Hãy nhập số nhỏ 0 từ bàn phím");
                number = Integer.parseInt(sc.nextLine());
                if (number > 0) {
                    System.out.println("Hãy nhập số nhỏ hơn 0");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Hãy nhập số");
            }
        }
        return number;
    }
}
