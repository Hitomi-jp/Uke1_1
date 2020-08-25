import java.util.*;

public class Program {

    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int[] randPerm(int n) {

            Random r = new Random();  // hentes fra java.util
            int[] a = new int[n]; // fyller tabellen med 1, 2, . . , n

            Arrays.setAll(a, i -> i+1);
            for (int k = n - 1; k > 0; k--) {
                int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
                bytt(a, k, i);
            }

            return a; // tabellen med permutasjonen returneres

        } // randPerm

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

       public static int kostnader(int[] a){
            int m = 0;
            for (int i = 1; i < a.length; i++) {
            }
            return m;
        }


        public static int maks1 ( int[] a){ // a er en heltallstabell
            if (a.length < 1)
                throw new java.util.NoSuchElementException("Tabellen a er tom!");
            int m = 0; // indeks til foreløpig største verdi

            for (int i = 1; i < a.length; i++) { //obs : starter fra med i = 1
                if (a[i] > a[m])
                    m = i;
            }
            return m;
        }

        public static int maks2 ( int[] a){ // version 2 av maks-metoden
            int m = 0;
            int maksverdi = a[0];

            for (int i = 1; i < a.length; i++)
                if (a[i] > maksverdi) {
                    maksverdi = a[i]; // største verdi oppdateres
                    m = i; // indeks til største verdi oppdateres
                }
            return m; // returnere indeks/positionen til største verdi

        }

        public static int maks3 ( int[] a){
            int sist = a.length - 1;
            int m = 0;
            int maksverdi = a[0];
            int temp = a[sist];
            a[sist] = 0xfffffff;

            for (int i = 0; ; i++)
                if (a[i] >= maksverdi) {
                    if (i == sist) {
                        a[sist] = temp;
                        return temp >= maksverdi ? sist : m;

                    } else {
                        maksverdi = a[i];
                        m = i;
                    }
                }

        }

        public static void main (String[]args){


            int n = 200_000, antall = 2_000;
            long tid = 0;
            int a [] = randPerm(n);

            System.out.println(antallMaks(randPerm(n)));

            tid = System.currentTimeMillis();
            for (int i = 0; i < antall; i++)
                kostnader(a);
            tid = System.currentTimeMillis() - tid;
            System.out.println("Faste kostnader: " + tid + " millisek");

            tid = System.currentTimeMillis();
            for (int i = 0; i < antall; i++)
                maks1(a);
            tid = System.currentTimeMillis() - tid;
            System.out.println("Maks1 - metoden: " + tid + " millisek");

            tid = System.currentTimeMillis();
            for (int i = 0; i < antall; i++)
                maks2(a);
            tid = System.currentTimeMillis() - tid;
            System.out.println("Maks2 - metoden: " + tid + " millisek");

            tid = System.currentTimeMillis();
            for (int i = 0; i < antall; i++)
                maks3(a);
            tid = System.currentTimeMillis() - tid;
            System.out.println("Maks3 - metoden: " + tid + " millisek");
        }
    }



