package TD3.modele;

import java.time.LocalDate;

public class Commande {

	private Client client;
	private Article article;
	private int quantite;
	private LocalDate dateCommande;
	private Vendeur vendeur;
	private double montant;
	
	public Commande(Client client, Article article, int quantite, LocalDate dateCommande, Vendeur vendeur) {
		super();
		this.client = client;
		this.article = article;
		this.quantite = quantite;
		this.dateCommande = dateCommande;
		this.vendeur = vendeur;
	}

	public Client getClient() {
		return client;
	}

	public Article getArticle() {
		return article;
	}

	public int getQuantite() {
		return quantite;
	}

	public LocalDate getDateCommande() {
		return dateCommande;
	}

	public Vendeur getVendeur() {
		return vendeur;
	}

	public double getMontant() {
		return montant;
	}

}
