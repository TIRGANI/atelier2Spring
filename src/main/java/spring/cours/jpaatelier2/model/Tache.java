package spring.cours.jpaatelier2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Tache {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTache;
	private int duree;
	@ManyToOne
	@JoinColumn(name = "idProjet")
	private ProjetDev dev;
	//get set 
	public long getIdTache() {
		return idTache;
	}
	public void setIdTache(long idTache) {
		this.idTache = idTache;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public ProjetDev getDev() {
		return dev;
	}
	public void setDev(ProjetDev dev) {
		this.dev = dev;
	}
	public void add(Tache tache) {
		this.idTache = tache.getIdTache();
		this.duree = tache.getDuree();
		
	}
	public void setProjet(ProjetDev p) {
		this.dev.setDescription(p.getDescription());
		this.dev.setLangage(p.getLangage());
		
	}
	
	
}
