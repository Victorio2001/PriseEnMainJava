import java.util.Scanner;

public class Exercice5 {

    public static boolean isPalindrome(String s) {

        //! VarStart -- Taille mot-1 -- condition -- Var+  Var-
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        System.out.println(isPalindrome(s));

    }
}
