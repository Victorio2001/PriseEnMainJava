package TD2;

public class Vendeur extends Employer {

    public Vendeur(String firstname, String lastname, int salaire, double chiffreAffaire) {
        super(firstname, lastname, salaire);
        this.chiffreAffaire = chiffreAffaire;
    }

    public Vendeur() {

    }

    double chiffreAffaire = 1;

    public double CalculSalaire(Vendeur employer) {
        return this.chiffreAffaire = this.salaire * employer.chiffreAffaire;
    }





}
