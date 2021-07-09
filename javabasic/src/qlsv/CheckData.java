package qlsv;

import java.util.Scanner;

public class CheckData {
    //Check dữ liệu đầu vào
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.println("In put Number: ");
        while (true) {
            try {
                number = Integer.parseInt(sc.nextLine());
                //number > 1 && number < 100
                if (number < 1 || number > 100) {
                    System.out.println("Input number form 1 to 100");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid number, please input again: ");
            }
        }
        System.out.println("Number is: " + number);

    }
}
