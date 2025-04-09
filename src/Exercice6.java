import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args)
    {
        int saisieClavier;
        int nb;
        int sum;

        System.out.print("Veuillez indiquer le nombre/chiffre souhaité : ");
        Scanner clavier = new Scanner (System.in);
        saisieClavier = clavier.nextInt();

        for(nb=1, sum=0; nb<=saisieClavier; nb++)
        {
            sum+=nb;
        }

        System.out.print("La somme de " + saisieClavier + " est " + sum);
        clavier.close();
    }
}
