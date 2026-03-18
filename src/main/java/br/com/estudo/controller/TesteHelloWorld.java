package br.com.estudo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste-java-labs")
public class TesteHelloWorld {

    @GetMapping
    public String testeJavaLabs ( ) {

        return "Hello World - Codespaces - Java - Labs.";
    }
}
