package co.edu.uceva.pais_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/holamundo-service")
public class PaisRestController {

    /**
     * este metodo solo saluda al navegador
     * @return
     */
    @GetMapping("/hola")
    public String imprimir(@PathVariable("nombre") String nombre){ //TODO hacer un saludo personalziado con el nombre

        return "hola mundo";
    }
}
