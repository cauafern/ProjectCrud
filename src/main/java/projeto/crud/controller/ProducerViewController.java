package projeto.crud.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import projeto.crud.domain.Producer;
import projeto.crud.service.ProducerService;

@Controller
@RequestMapping("/view/producers")
@RequiredArgsConstructor
public class ProducerViewController {

    private final ProducerService producerService;

    @GetMapping
    public String listProducers(Model model) {
        model.addAttribute("producers", producerService.listAll());
        return "producers";
    }

    @GetMapping("/delete-by-id")
    public String deleteProducer(@RequestParam("id") Long id) {
        producerService.deleteById(id); // Using your existing delete logic
        return "redirect:/view/producers";
    }

    @GetMapping("/add")
    public String addProducer(@RequestParam("name") String name, @RequestParam("stock") Integer stock) {
        Producer newProducer = new Producer();
        newProducer.setName(name);
        newProducer.setStockQuantity(stock);

        producerService.save(newProducer); // Using your existing save logic
        return "redirect:/view/producers";
    }


}

