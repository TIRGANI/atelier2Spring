package spring.cours.jpaatelier2.service;

import java.util.List;

import spring.cours.jpaatelier2.model.Developpeur;

public interface DevService {
	void ajouter(Developpeur dev);

	List<Developpeur> getDevs();

	void supprimer(int idDev);

	void modifier(Developpeur dev);

	Developpeur getDeveloppeur(int idDev);

	Developpeur getDeveloppeur(String email);

//obtenir les devs affecter a un projet
	List<Developpeur> getDev(long idProjet);

//Affcter un dev a une tache
	void affecterTache(int idDev, int idTache);
}
