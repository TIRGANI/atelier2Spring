package spring.cours.jpaatelier2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.cours.jpaatelier2.model.Developpeur;
import spring.cours.jpaatelier2.model.Tache;
import spring.cours.jpaatelier2.repository.DevRepository;
import spring.cours.jpaatelier2.repository.TacheRepository;

@Service
public class DevServiceImpl implements DevService {

	@Autowired
	DevRepository devRepository;
	@Autowired
	TacheRepository tacheRepository;

	@Override
	public void ajouter(Developpeur dev) {
		devRepository.save(dev);

	}

	@Override
	public List<Developpeur> getDevs() {
		return devRepository.findAll();
	}

	@Override
	public void supprimer(int idDev) {
		devRepository.deleteById(idDev);

	}

	@Override
	public void modifier(Developpeur dev) {
		Developpeur d = devRepository.getById((int) dev.getId());
		if (d != null)
			devRepository.save(d);

	}

	@Override
	public Developpeur getDeveloppeur(int idDev) {

		return devRepository.findById(idDev).get();
	}

	@Override
	public Developpeur getDeveloppeur(String email) {

		return devRepository.findByEmail(email);
	}

	@Override
	public List<Developpeur> getDev(long idProjet) {

		return devRepository.getDevs(idProjet);
	}

	@Override
	public void affecterTache(int idDev, int idTache) {
		Developpeur dev = devRepository.getById(idDev);
		Tache tache = tacheRepository.getById(idTache);
		if (dev != null && tache != null) {
			dev.getTache().add(tache);
			devRepository.save(dev);
		}

	}

}
