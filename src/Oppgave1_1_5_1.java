public class Oppgave1_1_5_1 {

    public static void main(String[] args) {
        int[] a = {};

        System.out.println(max(a));


        }

    public static int max(int[] a) {
        int sist = a.length - 1;
        int m = 0;
        int maxverdi = a[0];
        int temp = a[sist];
        a[sist] = 0x7fffffff;

        for (int i = 0; ; i++)
            if (a[i] >= maxverdi) {
                if (i == sist) {
                    a[sist] = temp;
                    return temp >= maxverdi ? sist : m;

                } else {
                    maxverdi = a[i];
                    m = i;
                }

            }
    }


}


