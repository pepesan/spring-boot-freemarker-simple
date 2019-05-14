package com.cursosdedesarrollo.webexample;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/dato")
public class DatoController {
    List<Dato> listado;

    DatoController(){
        this.listado= new ArrayList<Dato>();
        for (int i = 0; i < 10; i++) {
            Dato dato= new Dato();
            dato.setCadena("Mi cadena "+i);
            this.listado.add(dato);
        }
    }


    @GetMapping
    public List<Dato> showDatos(){
        return listado;
    }
    @PostMapping
    public Dato addDatos(Dato dato){
        this.listado.add(dato);
        System.out.println("Dato: "+ dato);
        return dato;
    }
    @RequestMapping("/1")
    @GetMapping
    public Dato showDato(){
        Dato dato = new Dato();
        dato.setCadena("Hola Don pepito!!!");
        return dato;
    }
}
