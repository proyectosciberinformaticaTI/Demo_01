package com.proyecto.index.controller;



import com.proyecto.index.bean.tablapersona;
import com.proyecto.index.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/curse")
public class PersonaController {


    private PersonaService ser;

    private tablapersona tabla;


    @Autowired
    public PersonaController(PersonaService er,tablapersona tp ){

        this.ser=er;
        this.tabla=tp;
}

@GetMapping(value = "/listar")
public List<tablapersona> index(){

   int contador=0;

    List<tablapersona> persona= ser.listar();
  System.out.print("Hola mundo"+  persona);
/*    for (tablapersona tp  : persona) {
        *//*return (List<tablapersona>) tp;*//*
    System.out.println("hola mundo"+tp);
        persona.get()
    }*/
    contador++;

        for (tablapersona pl : persona) {
            pl.setId(persona.get(contador).getCodigo());
            pl.setNombre(persona.get(contador).getNombre());
            pl.setTelefono(persona.get(contador).getTelefono());


    }
    return persona;


}

}
