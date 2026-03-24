package projeto.crud.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.crud.domain.Producer;
import projeto.crud.service.ProducerService;

@RestController
@RequestMapping("/producers")
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerService producerService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Producer producer) {
        producerService.save(producer);
        return ResponseEntity.ok().build();
    }

    @GetMapping()
    public ResponseEntity<Producer> findById(@RequestParam("name") String name) {
        return ResponseEntity.ok((Producer) producerService.findByName(name));
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestParam("id") Long id) {
        producerService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
