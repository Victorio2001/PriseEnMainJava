package TD3.modele;

import java.time.LocalDate;
import java.util.Map;

public class Grossiste extends Vendeur {
    public Grossiste(String lastname, String firstname, LocalDate dateNaissance, Map<Article, Integer> stock) {
        super(lastname, firstname, dateNaissance, stock);
    }
}