package TD2;

import java.util.*;

public class Exercice4 {
    public static void main(String[] args) {

        //! ouvrir le chat
        Scanner sc = new Scanner(System.in);
        //! recupe le chat
        String input = sc.nextLine().toLowerCase();

        getFrequencyMap(input);

    }



    //! hashmap == pas de tri juste clef/valeur, hashset == doublon, threeset == tri + doublon
        public static Map<Character, Integer> getFrequencyMap(String input) {
            Map<Character, Integer> frequencyMap = new HashMap<>();

                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
                }
            System.out.println(frequencyMap);
            return frequencyMap;
        }

}
