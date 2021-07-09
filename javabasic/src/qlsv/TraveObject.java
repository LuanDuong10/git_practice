package qlsv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TraveObject {
    public static void main(String[] args) {
        TraveObject tr = new TraveObject();
//        Student11 s = tr.inputStudent();
//        System.out.println(s);
        List<Student11> s = tr.getListStudent();
        for (Student11 o : s){
            System.out.println(o);
        }
    }

    public Student11 inputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = sc.nextLine();
        System.out.println("Input age: ");
        int age = Integer.parseInt(sc.nextLine());
        Student11 st = new Student11(name, age);
        return st;
    }
    public List<Student11> getListStudent(){
        Student11 s1 = new Student11("Nguyen Van B", 20);
        Student11 s2 = new Student11("Nguyen Van C", 20);
        Student11 s3 = new Student11("Nguyen Van D", 20);
        Student11 s4 = new Student11("Nguyen Van E", 20);

        List<Student11> listStudent = new ArrayList<>();
        listStudent.add(s1);
        listStudent.add(s2);
        listStudent.add(s3);
        listStudent.add(s4);

        return listStudent;
    }
}
