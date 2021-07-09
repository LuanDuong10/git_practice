package qlsv;

public class Main1 {
    public static void main(String[] args) {
        //Lay giu lieu qua Getter
        Student s = new Student("Nguyen Van Cong", 22);
        String name1 = s.getName();
        int b_tuoi = s.getAge();

        System.out.println("Name: " + name1);
        System.out.println("Age: " + b_tuoi);
    }
}
