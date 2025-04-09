public class Exercice3 {

    public static void main(String args[]){
        int i = 50;
        for (int j = 0; j <= i; j++){
            System.out.println(Foobar(j));
        }

    }

    private static String Foobar(int i) {
        if (i % 3 == 0) {
            return "hahaaha";
        }

        return Integer.toString(i);
    }


}
