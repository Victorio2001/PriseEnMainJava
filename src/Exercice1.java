public class Exercice1 {

    public static void main(String[] args) {
        System.out.println(estPair(2));
    }

    public static boolean estPair(long x){
        if(x % 2 == 0)
            return true;
        return false;
    }

}
