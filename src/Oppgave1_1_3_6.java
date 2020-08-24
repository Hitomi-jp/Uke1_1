public class Oppgave1_1_3_6 {

    public static long fak(int n){
        if(n<0) throw new IllegalArgumentException("n < 0 ");

        // initialize
        long fak = 1;

        for(int i = 2; i <= n; i++){
            fak *=i;
        }
        return fak;
    }

    public static void main(String[] args){
        System.out.println(fak(10));
    }

}
