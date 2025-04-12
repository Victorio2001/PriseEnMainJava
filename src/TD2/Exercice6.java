package TD2;

import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {

        Vendeur employer = new Vendeur();
        employer.chiffreAffaire = 1.1;
        employer.firstname = "John";
        employer.lastname = "Doe";
        employer.salaire = 1300;

        System.out.println(employer.CalculSalaire(employer));



    }
}
