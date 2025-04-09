package TD2;

import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        ResultatAnalyse resultatAnalyse = new ResultatAnalyse();
        System.out.println("Entrer la chaine charactère");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();

        resultatAnalyse.recupererCaracteresUtilisesTries(input);

        resultatAnalyse.recupererCaractereLePlusUtilise(input);

        resultatAnalyse.recupererCaracteresLesPlusUtilises(input);

    }
}
