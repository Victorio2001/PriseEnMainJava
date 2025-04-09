public class Main {
    public static void main(String[] args) {


        Monstre m1 = new Monstre();
        m1.taille = "120";
        m1.Couleur = "Blanc";
        m1.type = "Nain";

        int[] x = { 1,2,3,4,5,6,7,8,9,10 };

        for (int i = 0; i <= x.length-1; ++i) {
            System.out.println(x[i]);
        }
        int age = 23;
        String name = "Victorio";

        System.out.println(
                "Mon monstre: taille: " + m1.taille
        );
    }
}