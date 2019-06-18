package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import model.Dept;

public interface DeptRepository extends JpaRepository<Dept,Integer> {
	
}
