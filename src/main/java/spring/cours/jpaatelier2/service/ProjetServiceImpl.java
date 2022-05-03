package spring.cours.jpaatelier2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.cours.jpaatelier2.model.Projet;
import spring.cours.jpaatelier2.model.ProjetDev;
import spring.cours.jpaatelier2.model.Tache;
import spring.cours.jpaatelier2.repository.ProjetRepository;
import spring.cours.jpaatelier2.repository.TacheRepository;

@Service
public class ProjetServiceImpl implements ProjetService {
	@Autowired
	ProjetRepository projetRepository;
	@Autowired
	private TacheRepository tacheRepository;

	@Override
	public void ajouter(Projet projet) {

		projetRepository.save(projet);
	}

	@Override
	public List<Projet> lesProjets() {

		return projetRepository.findAll();
	}

	@Override
	public void supprimer(long idProjet) {
		projetRepository.deleteById((int) idProjet);

	}

	@Override
	public void modifier(Projet projet) {
		Projet p = getProjet(projet.getIdProjet());
		if (p != null) {
			p.setDescription(projet.getDescription());
			projetRepository.save(p);
		}

	}

	@Override
	public Projet getProjet(long idProjet) {
		// TODO Auto-generated method stub
		return projetRepository.getById((int) idProjet);
	}

	@Override
	public void ajouterTache(long idProjet, Tache tache) {
		ProjetDev p = getProjetDev(idProjet);
		if (p != null) {
			tache.setProjet(p);
			tacheRepository.save(tache);
		}

	}

	@Override
	public List<Tache> getTaches(long idProjet) {

		return projetRepository.getTaches((int) idProjet);
	}

	@Override
	public List<ProjetDev> lesProjetDev() {

		return projetRepository.getProjetDevs();
	}

	@Override
	public ProjetDev getProjetDev(long idProjet) {

		return projetRepository.getProjetDevs(idProjet);
	}

}
