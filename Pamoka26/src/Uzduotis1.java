import javax.lang.model.SourceVersion;

public class Uzduotis1 {
    public static void main(String[] args) {
        String zodis1 = "Antanas";
        int sk = 5;
        System.out.println(KurisIlgesnis(zodis1,sk) );
        String zodis2 = "ropė";
        int sk2 = 7;
        System.out.println(KurisIlgesnis(zodis2,sk2) );

        
    }

    public static boolean KurisIlgesnis(String zodis, int x) {
        return zodis.length() > x;
    }
}

