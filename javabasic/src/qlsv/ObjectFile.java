package qlsv;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectFile {
    //Ghi object vao file txt va doc file object ra
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("Nguyen Van A", 20);
        try {
            FileOutputStream fo = new FileOutputStream("sinhvien.txt");
            ObjectOutputStream oss = new ObjectOutputStream(fo);
            oss.writeObject(sv);
            oss.close();
            fo.close();

            FileInputStream fi = new FileInputStream("sinhvien.txt");
            ObjectInputStream osi = new ObjectInputStream(fi);
            SinhVien ss = (SinhVien) osi.readObject();
            System.out.println(ss);
            osi.close();
            fi.close();
        }
        catch (Exception e){

        }
    }
}
