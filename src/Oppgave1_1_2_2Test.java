import static org.junit.jupiter.api.Assertions.*;

class Oppgave1_1_2_2Test {

    @org.junit.jupiter.api.Test
    void min() {
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 20, 9, 2, 7, 19};

        int minimum = Oppgave1_1_2_2.min(a);

        assertEquals(6, minimum);
        assertEquals(1,a[minimum]);

        //Test for alle permutasjoner for 4 tall.
        {

        }


        //Test corner cases = "Spesialtilfeller"
        int[] b = {1, 4, 17, 10, 6, 20, 8};
        assertEquals(0,Oppgave1_1_2_2.min(b));

        int[] c = {8, 4, 17, 10, 6, 20, 1};
        assertEquals(6, Oppgave1_1_2_2.min(c));



    }
}