public class Uzduotis4 {
    public static void main(String[] args) {
        System.out.println(arKvadratas(12.5, 12.5, 12.5, 12.5));
        System.out.println(arKvadratas(1, 1, 1, 1));
        System.out.println(arKvadratas(13.4, 13.4, 13.34, 13.24));
    }
    public static boolean arKvadratas(double a, double b, double c, double d) {
        return a == b && a == c && a == d;
    }
}
