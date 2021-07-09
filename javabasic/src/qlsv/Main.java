package qlsv;

public class Main {
    public static void main(String[] args) {
        //truyen du lieu vao thong qua Constructor
        Student s = new Student("Nguyen Van A", 20);
        System.out.println(s);
        //Truyen du lieu vao object qua setter.
        Student s1 = new Student();
        s1.setName("Duong Quang B");
        s1.setAge(28);
        System.out.println(s1);
    }
}
