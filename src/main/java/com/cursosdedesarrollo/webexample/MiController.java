package com.cursosdedesarrollo.webexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/api/mi")
public class MiController {

    @GetMapping
    public String dameHola() {
        return "HolaMundo";
    }

    @PostMapping
    public String cogeHola(String str) {
        return "Adíos mundo cruel!!";
    }

}
