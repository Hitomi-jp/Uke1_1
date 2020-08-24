import java.sql.SQLOutput;
import java.util.*;

public class Program {

    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int[] randPerm(int n) {
        Random r = new Random();
        int[] a = new int[n];

        Arrays.setAll(a, i -> i + 1);
        for (int k = n - 1; k > 0; k--) {
            int i = r.nextInt(k + 1);
            bytt(a, k, i);
        }

        return a;
    }

    public static int antallMaks(int[] a) {
        int antall = 0;
        int maksverdi = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > maksverdi) {
                antall++;
                maksverdi = a[i];
            }
        }
        return antall;
    }

    public static int kostnader(int[] a) {
        int m = 0;
        for (int i = 1; i < a.length; i++) {
        }
        return m;
    }

    public static void main(String[] args) {

        int n = 100_000;
        System.out.println(antallMaks(randPerm(n)));
    }
}


