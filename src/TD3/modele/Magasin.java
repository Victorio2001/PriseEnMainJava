package TD3.modele;

import java.util.ArrayList;
import java.util.List;

public class Magasin {
	
	private List<Client> clients = new ArrayList<>();
	private List<Vendeur> vendeurs = new ArrayList<>();

	public double calculerChiffreAffairesTotal() {
		// TODO calculer le chiffre d'affaires total du magasin (regarder le montant des commandes des clients)
		return 0;
	}
	
	public double calculerChiffreAffairesPourTypeArticle(TypeArticle type) {
		// TODO calculer le CA pour un type d'article en particulier
		return 0;
	}
	
	public int compterNombreCommandes() {
		// TODO compter le nombre de commandes passées
		return 0;
	}
	
	public Client trouverMeilleurClient() {
		// TODO trouver le client qui a fait le plus d'achats (plus gros montant)
		return null;
	}
	
	public void ajouterClient(Client client) {
		clients.add(client);
	}
	
	public List<Client> getClients() {
		return clients;
	}
	
	public void ajouterVendeur(Vendeur vendeur) {
		vendeurs.add(vendeur);
	}
	
	public List<Vendeur> getVendeurs() {
		return vendeurs;
	}
	
}
