package ObjectClass;

public class Account {
    int a;
    int b;

    public void setData(int c, int d) {
        a = c;
        b = d;
    }

    //Ham in thong tin doi tuong
    public void showData() {
        System.out.println("Gia tri cua a = " + a);
        System.out.println("Gia tri cua b = " + b);
    }
}
