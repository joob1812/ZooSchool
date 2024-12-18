package sn.diamniadio.polytech.ZooSchool;

public class Animal {
    protected int id;
    protected String nom;
    protected String race;
    protected Personne proprietaire;

    public Animal(int id, String nom, String race, Personne proprietaire) {
    }


    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getRace() {
        return race;
    }

    public Personne getProprietaire() {
        return proprietaire;
    }

    public String crier() {
        return "En tant que";
    }

    public String seDeplacer() {
        return "En tant que";
    }

    public String sePresenter() {
        return "En tant que";
    }
    


}

