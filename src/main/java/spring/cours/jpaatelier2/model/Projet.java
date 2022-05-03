package spring.cours.jpaatelier2.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Projet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long idProjet;
	protected String description;

	public long getIdProjet() {
		return idProjet;
	}

	public void setIdProjet(long idProjet) {
		this.idProjet = idProjet;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
