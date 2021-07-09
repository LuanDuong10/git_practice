package baitap_01;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        int choose;
        Scanner sc = new Scanner(System.in);
        do {
            showMenu();
            System.out.println("Choose : ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    int n;
                    System.out.println("Nhap so sinh vien can them");
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student std = new Student();
                        std.inPutIfo();
                        studentList.add(std);
                    }
                    break;
                case 2:
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).showInfo();
                    }
                    break;
                case 3:
                    int minIndex = 0, maxIndex = 0;
                    float minMark, maxMark;
                    minMark = studentList.get(0).getMark();
                    maxMark = studentList.get(0).getMark();
                    for (int i = 1; i < studentList.size(); i++) {
                        if (studentList.get(i).getMark() < minMark) {
                            minIndex = i;
                            minMark = studentList.get(i).getMark();
                        }
                        if (studentList.get(i).getMark() > maxMark) {
                            maxIndex = i;
                            maxMark = studentList.get(i).getMark();
                        }
                    }
                    System.out.println("Sinh vien co diem TB cao nhat");
                    studentList.get(maxIndex).showInfo();
                    System.out.println("Sinh vien co diem TB thap nhat");
                    studentList.get(minIndex).showInfo();
                    break;
                case 4:
                    System.out.println("Nhap ma sinh vien can tim kiem");
                    String rollNoSeach = sc.nextLine();
                    int count = 0;
                    for (Student student : studentList) {
                        if (student.getRollNo().equals(rollNoSeach)) {
                            student.showInfo();
                            count++;
                        }
                        if (count == 0) {
                            System.out.println("Khong tim thay sinh vien nao");
                        }
                    }
                    break;
                case 5:
                    //B1 sap xep thong tin sinh vien theo thu tu A -Z;
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            int cmp = o1.getName().compareTo(o2.getName());
                            if (cmp >= 0) {
                                return -1;
                            }
                            return 1;
                        }
                    });
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).showInfo();
                    }
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Goodbye!!!");
                    break;
                default:
                    System.err.println("Nhap sai!!!");
                    break;
            }
        } while (choose != 7);
    }

    static void showMenu() {
        System.out.println("1. Nhap vao N sinh vien");
        System.out.println("2. Hien thi thong tin sinh vien");
        System.out.println("3. Hien thi Max va Min theo diem TB");
        System.out.println("4. Tim kiem theo MSSV");
        System.out.println("5. Sort A-Z theo ten sinh vien & hien thi");
        System.out.println("6. Hien thi sinh vien duoc hoc bong & sort mark giam dan");
        System.out.println("7. Thoat: ");
    }

}
