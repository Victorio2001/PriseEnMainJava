package TD3;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import TD3.modele.Article;
import TD3.modele.Client;
import TD3.modele.Grossiste;
import TD3.modele.Magasin;
import TD3.modele.Producteur;
import TD3.modele.TypeArticle;
import TD3.modele.Vendeur;
import TD3.modele.exceptions.StockInsuffisantException;
import TD3.modele.exceptions.TypeArticleInterditException;

public class ExerciceHeritage {

	public static void main(String[] args) {

		System.out.println("Création du magasin et des stocks");
		System.out.println("==========");
		// On crée un nouveau magasin
		Magasin magasin = new Magasin();

		Map<Article, Integer> Articles = new HashMap<>();
		
		// On ajoute des vendeurs au magasin
		Vendeur vendeur1 = new Producteur("Ternette", "Julien", LocalDate.of(1980, 3, 15), Articles);
		magasin.ajouterVendeur(vendeur1);
		
		Vendeur vendeur2 = new Producteur("Solette", "Pénélope", LocalDate.of(1975, 6, 5), Articles);
		magasin.ajouterVendeur(vendeur2);
		
		Vendeur vendeur3 = new Grossiste("Emmaus", "Mick", LocalDate.of(1980, 3, 15), Articles);
		magasin.ajouterVendeur(vendeur3);
		
		// On crée des nouveaux articles
		Article bananes = new Article("Bananes", 2.5, TypeArticle.FRUIT);
		Article fraises = new Article("Fraises", 4.99, TypeArticle.FRUIT);
		Article haricots = new Article("Haricots", 1.95, TypeArticle.LEGUME);
		Article avocats = new Article("Avocats", 3, TypeArticle.LEGUME);
		Article saladeFruits = new Article("Salade de fruits", 5.95, TypeArticle.TRANSFORME);




		
		String avocatsAffichage = avocats.toString();
		if (!avocatsAffichage.equals("Article de type LEGUME : Avocats à 3 euros")) {
			System.out.println("Erreur : Affichage incorrect de l'article Avocats.");
		}
		
		// On ajoute des articles au stock des vendeurs
		
		vendeur1.ajouterArticleAuStock(bananes, 10);
		vendeur1.ajouterArticleAuStock(haricots, 5);
		vendeur1.ajouterArticleAuStock(avocats, 2);
		
		vendeur2.ajouterArticleAuStock(fraises, 3);
		vendeur2.ajouterArticleAuStock(bananes, 5);
		
		// Le vendeur 2 n'a pas le droit de vendre des salades de fruits
		try {
			vendeur2.ajouterArticleAuStock(saladeFruits, 12);
			System.out.println("Erreur : un producteur ne peut pas vendre de produits transformés.");
		} catch (TypeArticleInterditException exc) {
		}
		
		vendeur3.ajouterArticleAuStock(saladeFruits, 5);
		vendeur3.ajouterArticleAuStock(haricots, 15);
		

		vendeur3.ajouterArticleAuStock(haricots, 10);
		int quantiteHaricotsVendus = vendeur3.getStock().get(haricots);
		if (quantiteHaricotsVendus != 25) {
			System.out.println("Erreur : La quantité d'article en stock est incorrect.");
		}
		
	
		// On crée des clients
		Client client1 = new Client("Delune", "Claire", LocalDate.of(1992, 1, 12));
		magasin.ajouterClient(client1);

		Client client2 = new Client("Cament", "Mehdi", LocalDate.of(1985, 12, 2));
		magasin.ajouterClient(client2);

		Client client3 = new Client("Tartine", "Kimberley", LocalDate.of(1990, 7, 16));
		magasin.ajouterClient(client3);
		

		System.out.println("Les clients passent les commandes");
		System.out.println("==========");
		
		// Les clients passent des commandes
		client1.commander(vendeur1, avocats, 2, LocalDate.of(2023, 1, 15));
		client1.commander(vendeur2, fraises, 2, LocalDate.of(2023, 1, 15));
		
		client2.commander(vendeur3, saladeFruits, 1, LocalDate.of(2023, 1, 18));
		
		// Le client 2 essaie de commander un article qu'un vendeur ne vend pas
		try {
			client2.commander(vendeur2, haricots, 5, LocalDate.of(2023, 1, 16));
			System.out.println("Erreur : l'article devrait être non disponible.");
		} catch (StockInsuffisantException exc) {
		}
		
		client3.commander(vendeur3, haricots, 10, LocalDate.of(2023, 1, 22));
		
		// Le client 3 essaie de commander des avocats, mais le vendeur 1 n'en a plus en stock.
		try {
			client3.commander(vendeur1, avocats, 1, LocalDate.of(2023, 1, 22));
			System.out.println("Erreur : le stock est insufissant.");
		} catch (StockInsuffisantException exc) {
		}
		
		// Le magasin vérifie les chiffres de vente
		
		System.out.println("Vérification des ventes du magasin");
		System.out.println("==========");
		
		double caTotal = magasin.calculerChiffreAffairesTotal();
		if (caTotal != 41.43) {
			System.out.println("Erreur : le chiffre d'affaires devrait valoir 41,43 €.");
		} else {
			System.out.println(String.format("Chiffre d'affaires total : %.2f €", caTotal));
		}
		
		double caFruits = magasin.calculerChiffreAffairesPourTypeArticle(TypeArticle.FRUIT);
		if (caFruits != 9.98) {
			System.out.println("Erreur : le chiffre d'affaires devrait valoir 9,98 €.");
		} else {
			System.out.println(String.format("Chiffre d'affaires fruits : %.2f €", caFruits));
		}
		
		int nbCommandes = magasin.compterNombreCommandes();
		if (nbCommandes != 4) {
			System.out.println("Erreur : il y a eu 4 commandes valides.");
		} else {
			System.out.println(nbCommandes + " commandes passées");
		}
		
		Client meilleurClient = magasin.trouverMeilleurClient();
		if (!meilleurClient.equals(client3)) {
			System.out.println("Erreur : Ce n'est pas le meilleur client.");
		} else {
			System.out.println("Le meilleur client est " + meilleurClient.getPrenom() 
			+ " " + meilleurClient.getNom());
		}
		
	}

}
