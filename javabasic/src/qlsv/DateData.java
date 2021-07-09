package qlsv;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateData {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println("----------------");
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(df.format(date));
    }
}
