package spring.cours.jpaatelier2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Developpeur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDev;
	@Column(nullable = false)
	private String nom;
	@Column(unique = true)
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "idTache")
	private Tache tache;
	
	
	//get set
	public long getId() {
		return idDev;
	}
	public void setId(long id) {
		this.idDev = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Tache getTache() {
		return tache;
	}
	public void setTache(Tache tache) {
		this.tache = tache;
	}
	

}
