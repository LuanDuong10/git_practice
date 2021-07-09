package qlsv;

import java.io.Serializable;

public class SinhVien implements Serializable {
    private String name;
    private int age;

    public SinhVien() {

    }

    public SinhVien(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(int age) {
        return age;
    }

    @Override
    public String toString() {
        return name + "\t" + age;
    }
}
