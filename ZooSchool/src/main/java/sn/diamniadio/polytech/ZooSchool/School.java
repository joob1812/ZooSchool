package sn.diamniadio.polytech.ZooSchool;

import java.util.List;

public class School {
    private int id;
    private String nom;
    private List<Dresseur> listDresseurs;

    public School(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListDresseurs(List<Dresseur> listDresseurs) {
        this.listDresseurs = listDresseurs;
    }

    public List<Dresseur> getListDresseurs() {
        return listDresseurs;
    }

//    public String afficherDresseurs() {
//        // Structure externe mutable : un tableau d'une seule case
//        String[] result = {""};
//
//        this.listDresseurs.forEach(dresseur -> result[0] += dresseur.getNom() + "\n");
//
//        return result[0]; // Retourner la chaîne concaténée
//    }

//    private String concate(String allDresseurs, String unDresseur) {
//        return (allDresseurs + " " + unDresseur);
//    }
//
//    private String afficherDresseurs() {
//        String result = "";
//        this.listDresseurs.forEach(dresseur -> {
//            concate(result,dresseur.getNom());
//        });
//        return result;
//    }


    private String concate(String allDresseurs, String unDresseur) {
        return (allDresseurs + " " + unDresseur);
    }

    public String afficherDresseurs() {
        final String[] result = {""};
        this.listDresseurs.forEach(dresseur -> {
            result[0] = concate(result[0], dresseur.getNom());
        });
        return result[0];
    }

}

//    public String Former() {
//        return "En tant que ecole, je forme des dresseurs";
//    }
//
//    public String Entrainer() {
//        return "J'entraine des dresseurs";
//    }




