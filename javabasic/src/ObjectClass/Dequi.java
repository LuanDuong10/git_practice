package ObjectClass;

public class Dequi {
    static int count = 0;

    static void welcome() {
        count++;
        if (count <= 5) {
            System.out.println(count + ". Welcome to gpcoder.com");
            welcome();
        }
    }

    public static void main(String[] args) {
        welcome();
    }
}
