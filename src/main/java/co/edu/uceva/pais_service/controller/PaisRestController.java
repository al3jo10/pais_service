package co.edu.uceva.pais_service.controller;

import co.edu.uceva.pais_service.model.entities.Pais;
import co.edu.uceva.pais_service.model.service.IPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pais-servise")
public class PaisRestController {

    @Autowired
    IPaisService paisService;

    /**
     * este metodo solo saluda al navegador
     * @return
     */
    @GetMapping("/hola/{nombre}")
    public String imprimir(@PathVariable("nombre") String nombre){ //TODO hacer un saludo personalziado con el nombre

        return "hola mundo "+ nombre;
    }
    @GetMapping("/paises")
    public List<Pais> Listar(){
        return paisService.findAll();
    }
    @GetMapping("/paises/{id}")
    public Pais buscarPais(@PathVariable("id")Long id){
        return paisService.findById(id);

    }
}
