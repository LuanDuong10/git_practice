package qlsv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainStudent5 {
    public static void main(String[] args) {
        Student5 s = new Student5("Duong Quang A", 28, 7);
        Student5 s1 = new Student5("Duong Quang B", 18, 8.0f);
        Student5 s2 = new Student5("Duong Quang C", 15, 9);
        Student5 s3 = new Student5("Duong Quang D", 18, 10);

        List<Student5> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s);

        for (Student5 o : studentList
        ) {
            System.out.println("Name: " + o.getName() + " " + "Age: " + o.getAge() + " " + "Mark: " + o.getMark());

        }
        Collections.sort(studentList, new Comparator<Student5>() {
            @Override
            public int compare(Student5 o1, Student5 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("List after sort by mark");
        for (Student5 o : studentList
        ) {
            System.out.println("Name: " + o.getName() + " " + "Age: " + o.getAge() + " " + "Mark: " + o.getMark());

        }
    }
}
