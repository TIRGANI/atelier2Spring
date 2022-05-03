package spring.cours.jpaatelier2.service;

import java.util.List;


import spring.cours.jpaatelier2.model.Projet;
import spring.cours.jpaatelier2.model.ProjetDev;
import spring.cours.jpaatelier2.model.Tache;

public interface ProjetService {
	public void ajouter(Projet projet);

	public List<Projet> lesProjets();

	public void supprimer(long idProjet);

	public void modifier(Projet projet);

	public Projet getProjet(long idProjet);

	public void ajouterTache(long idProjet, Tache tache);

	public List<Tache> getTaches(long idProjet);

	public List<ProjetDev> lesProjetDev();

	public ProjetDev getProjetDev(long idProjet);
}
