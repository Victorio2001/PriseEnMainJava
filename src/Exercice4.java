import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        String line;
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            line = sc.nextLine();

            String[] ages = line.split(" ");

            int nombreTravailleurs = 0;
            for (String age : ages) {
                int ageInt = Integer.parseInt(age);
                if (ageInt >= 18  && ageInt <= 65) {
                    nombreTravailleurs++;
                }
            }
            System.out.println(nombreTravailleurs);
        }
    }
}
