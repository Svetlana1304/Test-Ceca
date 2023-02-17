public class Main public class Main {
    public static void main(String[] args) {
        int x=523134;
        int y=325423;

        double z=x%y;

        System.out.println(z);

        if(z==0){
            System.out.println("Ostatak ne postoji");
        } else if (z>1000) {
            System.out.println("Ostatak veći od 1000");
        } else {
            System.out.println("Ostatak manji od 1000");
        }
    }
}