package TD3.modele;


import java.time.LocalDate;

public abstract class Utilisateur {

    public Utilisateur(String lastname, String firstname, LocalDate dateNaissance) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.dateNaissance = dateNaissance;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    String firstname = "EmployerName";
    String lastname = "EmployerLastName";
    LocalDate dateNaissance = LocalDate.now();

}
