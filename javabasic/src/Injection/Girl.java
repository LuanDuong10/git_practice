package Injection;

public class Girl {
    private Outfit outfit;

    public Girl(){
        outfit = new Bikini();
    }
    public Girl(Outfit anything){
        this.outfit = anything;
    }

    public static void main(String[] args) {
        Outfit bikini = new Bikini();
        Girl ngocTrinh = new Girl(bikini);
    }
}
