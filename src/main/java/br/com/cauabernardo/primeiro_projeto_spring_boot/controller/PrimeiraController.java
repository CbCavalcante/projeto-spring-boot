package br.com.cauabernardo.primeiro_projeto_spring_boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;


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
    
    @PostMapping("/bodyParams")
    public String bodyParams(@RequestBody Usuario usuario) {
        return "bodyParams" + usuario.username();
    }
    
    record Usuario(String username){
    }

    @PostMapping("/metodoHeaders")
    public String metedoHeaders(@RequestHeader("name") String name) {
        return "bodyParams" + name;
    }
}