package TD3.modele;

import TD2.Employer;
import TD3.modele.exceptions.StockInsuffisantException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Client extends Utilisateur {

	public Client(String lastname, String firstname, LocalDate dateNaissance) {
		super(lastname, firstname, dateNaissance);
	}

	public String getNom() {

		return this.getLastname();
	}

	public String getPrenom() {

		return this.getFirstname();
	}


	private List<Commande> commandes = new ArrayList<>();

	public void commander(Vendeur vendeur, Article article, int quantite, LocalDate date) {
		// On récupère le stock du vendeur
		Map<Article, Integer> stock = vendeur.getStock();

		if(stock == null) {
			throw new StockInsuffisantException();
		}
		boolean stockInsuffisant = false;

		// Si le stock est insufissant, on lève une exception
		// TODO Faire lever une exception StockInsufissantException
		if(	vendeur.checkStock(article)) {
			throw new StockInsuffisantException();
		}



		// On crée la commande
		// TODO créer une nouvelle commande et l'ajouter aux commandes du client

		// On diminue le stock du vendeur
		vendeur.diminuerStock(article, quantite);
	}

	public List<Commande> getCommandes() {
		return commandes;
	}
}


