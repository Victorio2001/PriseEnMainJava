package TD3.modele;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Producteur extends Vendeur {


    public Producteur(String lastname, String firstname, LocalDate dateNaissance, Map<Article, Integer> stock) {
        super(lastname, firstname, dateNaissance, stock);
    }


    public void ajouterArticleAuStock(Article article, int quantite) {
        this.getStock().put(article, quantite);
    }


}
