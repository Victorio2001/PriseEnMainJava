package TD3.modele;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public abstract class Vendeur extends Utilisateur{

	public Vendeur(String lastname, String firstname, LocalDate dateNaissance, Map<Article, Integer> stock) {
		super(lastname, firstname, dateNaissance);
		this.stock = stock;
	}


	//! ici on a un stock de type Map<Article, Integer> qui contient la liste des articles et leur quantité
	private Map<Article, Integer> stock = new HashMap<>();


	public boolean checkStock(Article article){
		this.stock.get(article);
		int stock = this.stock.get(article);
		if(stock == 0){
			return false;
		}
		return true;
	}
	
	public void ajouterArticleAuStock(Article article, int quantite) {
		this.stock.put(article, quantite);
	}
	
	public void diminuerStock(Article article, int quantite) {
		this.stock.put(article, quantite);

	}

	public Map<Article, Integer> getStock() {
		return stock;
	}

}
