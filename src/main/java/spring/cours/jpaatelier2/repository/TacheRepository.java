package spring.cours.jpaatelier2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import spring.cours.jpaatelier2.model.ProjetDev;
import spring.cours.jpaatelier2.model.Tache;

public interface TacheRepository extends JpaRepository<Tache, Integer> {
	
	//list des taches
		@Query("select t from Tache ")
		List<Tache> getTaches();

	
}
