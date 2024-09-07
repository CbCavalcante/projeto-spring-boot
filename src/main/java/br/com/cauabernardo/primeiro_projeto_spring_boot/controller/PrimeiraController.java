package br.com.cauabernardo.primeiro_projeto_spring_boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/primeiroController")
public class PrimeiraController {

    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id) {
        return "O parametro é " + id;
    }

    @GetMapping("/queryParams")
    public String queryParams(@RequestParam String id) {
        return "O parametro com query params é " + id;
    }   
}
