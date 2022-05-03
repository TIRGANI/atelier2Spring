package spring.cours.jpaatelier2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import spring.cours.jpaatelier2.model.Projet;
import spring.cours.jpaatelier2.model.ProjetDev;
import spring.cours.jpaatelier2.model.Tache;

public interface ProjetRepository extends JpaRepository<Projet, Integer> {
//obtenir les taches d'un projet:
	@Query("select t from Tache t where t.projet.idProjet=:idProjet")
	List<Tache> getTaches(@Param("idProjet") long idProjet);

//obtenir tout les projet dev
	@Query("select p from ProjetDev p")
	List<ProjetDev> getProjetDevs();

//obtenir un projet dev par id
	@Query("select p from ProjetDev p where idProjet=:idP")
	ProjetDev getProjetDevs(@Param("idP") long id);

}
