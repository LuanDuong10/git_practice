package ObjectClass;

public class ObjectArray {
    public static void main(String[] args) {
        Account obj[] = new Account[2];
        String obj1[] = new String[3];

        obj[0].setData(1, 2);
        obj[1].setData(3, 4);

        System.out.println("Phan tu mang 0");
        obj[0].showData();
        System.out.println("Phan tu mang 1");
        obj[1].showData();
    }
}
