package projeto.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.crud.domain.Producer;

import java.util.List;
@Repository
public interface ProducerRepository  extends JpaRepository<Producer, Long> {

    List<Producer> findByName(String name);

//    List<Producer> findByNameContainingIgnoreCase(String name);

}
