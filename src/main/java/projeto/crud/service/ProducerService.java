package projeto.crud.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import projeto.crud.domain.Producer;
import projeto.crud.repository.ProducerRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProducerService {

    private final ProducerRepository repository;

    public void save(Producer producer) {
        repository.saveAndFlush(producer);
    }

    public List<Producer> findByName(String name) {
        if (name == null || name.isBlank()) {
            return repository.findAll();
        }
        return repository.findByName(name);
    }

    public List<Producer> listAll() {
        return repository.findAll();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
