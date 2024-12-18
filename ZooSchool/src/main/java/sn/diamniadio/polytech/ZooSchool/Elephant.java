package sn.diamniadio.polytech.ZooSchool;

public class Elephant extends Animal {
    public Elephant(int id, String nom, Personne proprietaire) {
        super(id, nom, "Lion", proprietaire);
    }


    public String crier() {
        return super.crier() + " elephant, je rugit !";
    }

    public String seDeplacer() {
        return super.seDeplacer() + " elephant, je cours rapidement.";
    }

    public String sePresenter() {
        return super.seDeplacer() + " elephant, je me presente.";
    }
}


