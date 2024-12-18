package sn.diamniadio.polytech.ZooSchool;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.diamniadio.polytech.ZooSchool.School.*;

import java.util.List;

@SpringBootApplication
public class ZooSchoolApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ZooSchoolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Bienvenue dans ZooSchool! L'application est en cours d'exécution.");

		// Création de quelques dresseurs
		Dresseur dresseur1 = new Dresseur(1, "Dupont", "Alice", 30);
		Dresseur dresseur2 = new Dresseur(2, "Martin", "Bob", 35);
		Dresseur dresseur3 = new Dresseur(3, "Petit", "Charlie", 40);

		// Création d'une école et ajout des dresseurs
		School school = new School(1, "Zoo Academy");
		school.setListDresseurs(List.of(dresseur1, dresseur2, dresseur3));

		// Affichage des dresseurs
		String dresseurs = school.afficherDresseurs();
		System.out.println("Liste des dresseurs :");
		System.out.println(dresseurs);

		// Exemple d'utilisation d'une méthode spécifique à Dresseur
//		dresseur1.entrainer();
	}


}