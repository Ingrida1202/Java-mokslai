public class Uzduotis2 {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        int rezultatas2 = aritmetinisVeiksmas(x, y);
        System.out.println("rezultatas2 = " + rezultatas2);
    }
    public static int aritmetinisVeiksmas (int x, int y) {
        int rezultatas;
        if (x % 2 == 0) {
            rezultatas = x * y;
        }
        else{
            rezultatas = y - x;
        }

       return rezultatas;

    }


}
