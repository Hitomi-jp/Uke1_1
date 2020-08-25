public class Oppgave1_1_2_2 {

    public static void main(String[] args) {

        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 20, 9, 2, 7, 19};

        int [] result = minmax(a);
        for(int i = 0; i<result.length; i++){
            System.out.println(result[i]);
        }

        int min_index = min(a);
        System.out.println(min_index);
        System.out.println(a[min_index]);

    }

    static int min(int[] a) {
        //Initialisere med første element
        int min_value = a[0];
        int min_index = 0;

        //Loop over alle resterende elementer
        //et mindre tall.
        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int index = i;

            //Sjekk om verdien er mindre enn det vi har sett tidligere.
            if (value < min_value) {
                min_value = value;
                min_index = index;
            }

        }

        //Returnere index til minste verdi.
        return min_index;
    }

    static int max(int[] a) {
        //Initialisere med første element
        int max_value = a[0];
        int max_index = 0;
        //Loop over alle resterende elementer
        //et største tall.
        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int index = i;
            if (value > max_value) {
                max_value = value;
                max_index = index;
            }
        }
        //Returnere index til minste verdi.
        return max_index;
    }

    public static int[] minmax(int[] a) {
        //Initialisere med første element
        int min_value = a[0];
        int min_index = 0;
        int max_value = a[0];
        int max_index = 0;
        int value = 0;


        //Loop over alle resterende elementer
        //et mindre tall and et støste tall
        for (int i = 1; i < a.length; i++) {
            value = a[i];

            //Sjekk om verdien er mindre enn det vi har sett tidligere.
            if (value >= max_value) {
                max_value = a[i];
                max_index = i;
            } else if (value < min_value) {
                min_value = value;
                min_index = i;
            }
        }
        return new int[]{min_index, max_index};
    }
}
