package baitap_01;

import java.util.Scanner;

public class Student extends Person {
    String rollNo;
    float mark;
    String email;

    public Student() {

    }

    @Override
    public void inPutIfo() {
        super.inPutIfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        while (true) {
            String rollNoInput = sc.nextLine();
            boolean check = setRollNo(rollNoInput);
            if (check = true) {
                break;
            }
        }
        System.out.println("Nhap vao diem sinh vien ");
        while (true) {
            Float markInput = Float.parseFloat(sc.nextLine());
            boolean check = setMark(markInput);
            if (check = true) {
                break;
            }
        }
        System.out.println("Nhap vao email: ");
        while (true) {
            //Nhap vao dia chi email tu ban phim
            String emailInput = sc.nextLine();
            //truyen dia chi email vao thuoc tinh
            boolean check = setEmail(emailInput);
            if (check = true) {
                break;
            }
        }
    }

    public String getRollNo() {
        return rollNo;
    }

    public boolean setRollNo(String rollNo) {
        if (rollNo != null && rollNo.length() >= 8) {
            this.rollNo = rollNo;
            return true;
        } else {
            System.err.println("Nhap lai ma sinh vien(MSSV >=8): ");
            return false;
        }
    }

    public float getMark() {
        return mark;
    }

    public boolean setMark(float mark) {
        if (mark > 0 && mark <= 10) {
            this.mark = mark;
            return true;
        } else {
            System.err.println("Nhap diem sinh vien(Diem nhap phai > 0 && <=10): ");
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email != null && email.contains("@") && !email.contains(" ")) {  //email phai co @ va khong co khoang trang
            this.email = email;
            return true;
        } else {
            System.out.println("Nhap lai dia chi email (do dai email >=8): ");
            return false;
        }
    }

    public boolean checkScholarship() {
        if (mark >= 8) {
            return true;
        } else {
            return false;
        }
    }
}
