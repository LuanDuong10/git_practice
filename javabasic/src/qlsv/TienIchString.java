package qlsv;

public class TienIchString {
    public static void main(String[] args) {
        String txt = "hoc   lap    Trinh    rat la Vui          ";
        //viet hoa va viet thuong toan bo chuoi
        String txt1 = txt.toUpperCase(); //viet hoa
        System.out.println(txt1);

        System.out.println("-------------------");
        String txt2 = txt.toLowerCase();//viet thuong
        System.out.println(txt2);

        //cat String
        System.out.println("-------------------");
        String txt3 = txt.substring(4, 14);
        System.out.println(txt3);
        //trim
        System.out.println("-------------------");
        System.out.println(txt);
        String txt4 = txt.trim();
        System.out.println(txt4);
        //replaceAll
        System.out.println("-------------------");
        String txt5 = txt.replaceAll("\\s+", " ");
        txt5 = txt5.trim();
        System.out.println(txt5);
    }
}
