package qlsv;

public class MainDay4 {
    public static void main(String[] args) {
        Student smain = new Student();
        //Truyen du lieu vao thi dung setter, lay du lieu ra dung getter.
        smain.setName("Duong Van A");
        smain.setAge(28);

        //Lay du lieu getter
        String name1 = smain.getName();
        int b_tuoi = smain.getAge();
        System.out.println("Name: " + name1);
        System.out.println("Age: " + b_tuoi);
    }
}
