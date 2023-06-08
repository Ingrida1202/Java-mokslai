public class Uzduotis3 {
    public static void main(String[] args) {
        System.out.println(arGalimaSudarytiTrikampi(25, 14, 10));
        System.out.println(arGalimaSudarytiTrikampi(1, 1, 1));
        System.out.println(arGalimaSudarytiTrikampi(12, 5, 7));
        System.out.println(arGalimaSudarytiTrikampi(123.451, 146.541, 100.2257));
    }
    public static boolean arGalimaSudarytiTrikampi(double a, double b, double c) {
        return a + b > c && b + c > a && a + c > b;
    }
}
