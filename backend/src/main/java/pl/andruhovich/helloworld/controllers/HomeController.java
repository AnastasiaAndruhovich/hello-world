package pl.andruhovich.helloworld.controllers;

import pl.andruhovich.helloworld.entity.Greeting;
import pl.andruhovich.helloworld.repository.GreetingRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final GreetingRepository repository;

    public HomeController(GreetingRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public Greeting showHome(String name, Model model) {
        return repository.findById(1).orElse(new Greeting("Not Found 😕"));
    }

}
