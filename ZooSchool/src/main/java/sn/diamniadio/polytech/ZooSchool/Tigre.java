package sn.diamniadio.polytech.ZooSchool;

public class Tigre extends Animal {
    public Tigre(int id, String nom, Personne proprietaire) {
        super(id, nom, "Lion", proprietaire);
    }

//----------------------------------------------------------------------------

    public String crier() {
        return super.crier() + " tigre, je rugit !";
    }

    public String seDeplacer() {
        return super.seDeplacer() + " tigre, je cours rapidement.";
    }

    public String sePresenter() {
        return super.seDeplacer() + " tigre, je me presente.";
    }
}


