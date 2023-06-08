public class Uzduotis1 {
    public static void main(String[] args) {
        System.out.println(arDalinasiIsAbieju(25, 6, 5));
        System.out.println(arDalinasiIsAbieju(-100, 10, -20));
        System.out.println(arDalinasiIsAbieju(140, 7, 2));
        System.out.println(arDalinasiIsAbieju(12, 4, 5));
    }

    // 2 punktas
    public static boolean arDalinasiIsAbieju(int skaicius, int daliklis1, int daliklis2) {
        return skaicius % daliklis1 == 0 && skaicius % daliklis2 == 0;
    }

}
