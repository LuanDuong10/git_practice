package examplejavacore;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class BT02 {
    public static void main(String[] args) {
        System.out.println("Nhap vao 3 so nguyen bat ky tu ban phim");
        Scanner sc = new Scanner(System.in);
        float a = Float.parseFloat(sc.nextLine());
        float b = Float.parseFloat(sc.nextLine());
        float c = Float.parseFloat(sc.nextLine());
        giaiPTBAC2(a, b, c);

    }

    public static void giaiPTBAC2(float a, float b, float c) {
        float deltal = b * b - (4 * a * c);
        if (a == 0) System.out.println("Phuong trinh co nghiem la: " + -b / c);
        else {
            if (deltal < 0) System.out.println("Phuong trinh da cho vo nghiem: ");
            if (deltal == 0) System.out.println("Phuong trinh co nghiem kep: " + (-b) / (2 * a));
            if (deltal > 0) {
                System.out.println("Phuong trinh co nghiem phan biet: " + ((-b + Math.sqrt(deltal)) / 2 * a) + " Va " + ((-b - Math.sqrt(deltal)) / 2 * a));
            }
        }
    }
}
