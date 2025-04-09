public class Exercice2 {
    public static void main(String args[]){

        System.out.println(getFactorial(7));
    }

    public static int getFactorial(int f) {
        int x = 1;
        for (int i = 1; i <= f; i++) {
            x = x * i;
        }
        return x;
    }
}
