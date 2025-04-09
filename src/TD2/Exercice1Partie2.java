package TD2;

public class Exercice1Partie2 {
    public static void main(String[] args) {

        Segment s = new Segment();
        s.point1 = 1;
        s.point2 = 2;

        int txt = s.calculSegment();
        System.out.print("Calcul Segment: "+ txt);
    }


}
