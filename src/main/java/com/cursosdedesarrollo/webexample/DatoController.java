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
            dato.setId(i);
            dato.setCadena("Mi cadena "+i);
            this.listado.add(dato);
        }
    }


    @GetMapping
    public List<Dato> showDatos(){
        // Coger el listado de la BBDD
        return listado;
    }
    @PostMapping
    public Dato addDatos(@RequestBody Dato dato){
        // Añadir el dato a las BBDD
        dato.setId(this.listado.size());
        this.listado.add(dato);
        return dato;
    }

    @GetMapping("/{id}")
    public Dato getDato(@PathVariable(value = "id") Integer id){
        // Coger el dato de BBDD
        /*
        Dato dato = new Dato();
        dato.setId(id);
        dato.setCadena("Hola Don pepito!!!");
        */
        for (Dato dato: this.listado) {
            if(dato.getId().equals(id)){
                return dato;
            }
        }
        Dato datoVacio = new Dato();
        return datoVacio;
    }

    @PutMapping("/{id}")
    public Dato editDato(@PathVariable(value = "id") Integer id,
                         @RequestBody Dato dato){
        // Modifica en la BBDD
        dato.setId(id);
        for (Dato datoi: this.listado) {
            if(datoi.getId().equals(id)){
                datoi.setCadena(dato.getCadena());
                return datoi;
            }
        }
        return dato;
    }

    @DeleteMapping("/{id}")
    public Dato deleteDato(@PathVariable(value = "id") Integer id){
        // Borra en la BBDD
        /*
        Dato dato = new Dato();
        dato.setId(id);
        dato.setCadena("Borrado");
        */
        for (Dato dato: this.listado) {
            if(dato.getId().equals(id)){
                Dato datoi= new Dato();
                datoi.setId(id);
                datoi.setCadena(dato.getCadena());
                this.listado.remove(dato);
                return datoi;
            }
        }
        Dato datoVacio= new Dato();
        return datoVacio;
    }
}
