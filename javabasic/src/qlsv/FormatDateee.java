package qlsv;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDateee {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(df.format(date));

        System.out.println("-------------------");
        SimpleDateFormat df1 = new SimpleDateFormat("MM dd yyyy");
        System.out.println(df1.format(date));

        System.out.println("-------------------");
        SimpleDateFormat df2 = new SimpleDateFormat("MMM dd yyyy");
        System.out.println(df2.format(date));
    }
}
