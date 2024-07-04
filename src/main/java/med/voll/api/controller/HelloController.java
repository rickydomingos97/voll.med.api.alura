package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// anotacao usada para api rest
@RestController
// qual url que esse controller vai responder
@RequestMapping("/oi")
public class HelloController {
    // metodo para responder a requisição http do controller
    // qual metodo do protocolo http que esse controller vai responder
    @GetMapping
    public String hello() {
        return "Hello World Spring Boot";
    }
    // chegou uma req http do tipo get no /hello entao responde com o texto Hello World Spring Boot
    // @GetMapping indica que esse metodo vai responder a requisição http do tipo get vinda do /hello

}