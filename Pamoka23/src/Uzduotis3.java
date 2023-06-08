public class Uzduotis3 {
    public static void main(String[] args) {
        System.out.println(arKartotinis(20, 5));
        System.out.println(arKartotinis(14, 5));
    }
    
    public static boolean arKartotinis(int x, int y) {
        return x % y == 0;
    }
}
