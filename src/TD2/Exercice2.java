package TD2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //! recup l'input
        String input = sc.nextLine().toLowerCase();

        //?Set<Character> distinctChars = new HashSet<>();
        Set<Character> distinctChars = new HashSet<>();

        for (char c : input.toCharArray()) {
            distinctChars.add(c);
        }

        System.out.println("Caractères distincts :");

        for (char c : distinctChars) {
            System.out.println(c);
        }

    }
}
