package ObjectClass;

public class testt {
    int data = 50;

    void change(int data) {
        data = data + 100;
        System.out.println(data);
    }

    public static void main(String[] args) {
        testt t = new testt();
        System.out.println("Truoc khi thay doi: " + t.data);
        t.change(500);
        System.out.println("Sau khi thay doi: " + t.data);
    }
}
