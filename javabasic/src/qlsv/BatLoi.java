package qlsv;

public class BatLoi {
    public static void main(String[] args) {
        int number = 1;
        String num = "sda";
        try {
            number = Integer.parseInt(num);
        }
        catch (Exception e){
            System.out.println("can not parse to int");
        }
        System.out.println("Number: " + number);
    }
}
