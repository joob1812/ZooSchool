package sn.diamniadio.polytech.ZooSchool;

public class Lion extends Animal {
    public Lion(int id, String nom, Personne proprietaire) {
        super(id, nom, "Lion", proprietaire);
    }


    public String crier() {
        return super.crier() + " lion, je rugit !";
    }

    public String seDeplacer() {
        return super.seDeplacer() + " lion, je cours rapidement.";
    }

    public String sePresenter() {
        return super.seDeplacer() + " lion, je me presente.";
    }
}


