package spring.cours.jpaatelier2.model;

import javax.persistence.Entity;

@Entity
public class ProjetRes extends Projet {
	private String budjet;

	public String getBudjet() {
		return budjet;
	}

	public void setBudjet(String budjet) {
		this.budjet = budjet;
	}

}
