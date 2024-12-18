package sn.diamniadio.polytech.ZooSchool;

import java.util.List;

public class Zoo {
    private  int id;
    private String ville;
    private List<Animal> listeAnimaux;
    private List<Dresseur> listeDresseurs;

    public Zoo(int id, String ville, List<Animal> listeAnimaux) {
        this.id = id;
        this.ville = ville;
        this.listeAnimaux = listeAnimaux;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public List<Animal> getListeAnimaux() {
        return listeAnimaux;
    }
    public void setListeAnimaux(List<Animal> listeAnimaux) {
        this.listeAnimaux = listeAnimaux;
    }
    public List<Dresseur> getListeDresseurs() {
        return listeDresseurs;
    }
    public void setListeDresseurs(List<Dresseur> listeDresseurs) {
        this.listeDresseurs = listeDresseurs;
    }
//    --------------------------------------------------------------------

    public void ajouterAnimal(Animal animal) {
        this.listeAnimaux.add(animal);
    }

    public void supprimerAnimal(Animal animal) {
        this.listeAnimaux.remove(animal);
    }

    public void afficherAnimaux() {
        for (Animal animal : this.listeAnimaux) {
            System.out.println(animal.sePresenter());
        }
    }
}

