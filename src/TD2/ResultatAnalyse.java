package TD2;

import java.util.*;

public class ResultatAnalyse {

    ///
    //! Char avec le plus d'occurences
    ///
    public Character recupererCaractereLePlusUtilise(String input) {

        char maxappearchar = ' ';
        int counter = 0;
        int[] charcnt = new int[Character.MAX_VALUE + 1];


        for (int i = 0 ; i < input.length() ; i++)
        {
            char ch = input.charAt(i);
            // increment this character's cnt and compare it to our max.
            charcnt[ch]++ ;
            if (charcnt[ch] >= counter)
            {
                counter = charcnt[ch];
                maxappearchar = ch;
            }
        }
        System.out.println("the max char is   " +maxappearchar + "  and displayed  " +counter+ "  times");
        return maxappearchar;
    }

    ///
    //! par ordre alphabétique
    ///
    public Collection<Character> recupererCaracteresUtilisesTries(String input) {
        //? trier et check doublon
        Set<Character> distinctChars = new TreeSet<>();
        //? Ajout de chaque char dans un tableau
        for (char c : input.toCharArray()) {
            distinctChars.add(c);
        }
        System.out.println(distinctChars);
        return distinctChars;
    }


    ///
    //! par ordre alphabétique
    ///
    public Collection<Character> recupererCaracteresLesPlusUtilises(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(frequencyMap);
        return frequencyMap.keySet();

    }



//    public Map<Character, Integer> recupererCaracteresEtOccurences(String input) {
//
//    }

}
