package spring.cours.jpaatelier2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import spring.cours.jpaatelier2.model.Developpeur;

public interface DevRepository extends JpaRepository<Developpeur, Integer> {
	Developpeur findByEmail(String email);
	Developpeur findByEmail(int idP);

	@Query("select d from Developpeur d JOIN d.tache  where tache.dev.idProjet =:idP")
	List<Developpeur> getDevs(@Param("idP") long idProjet);

}
