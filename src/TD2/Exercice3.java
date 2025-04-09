package TD2;

import java.util.*;

public class Exercice3 {
    public class DistinctCharsImproved {
        public static void main(String[] args) {

            //! ouvrir le chat
            Scanner sc = new Scanner(System.in);

            //! recupe le chat
            String input = sc.nextLine().toLowerCase();

            //! trier et check doublon
            Set<Character> distinctChars = new TreeSet<>();

            //! Ajout de chaque char dans un tableau
            for (char c : input.toCharArray()) {
                distinctChars.add(c);
            }

            System.out.println("Caractères distincts triés :");
            //! itération
            for (char c : distinctChars) {
                System.out.println(c);
            }
        }
    }
}
