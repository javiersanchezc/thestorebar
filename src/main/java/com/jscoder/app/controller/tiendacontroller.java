package com.jscoder.app.controller;

import com.jscoder.app.repository.entity.Tienda;
import com.jscoder.app.service.ItiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class tiendacontroller {

    @Autowired
    ItiendaService itiendaService;

    @GetMapping("/tienda")
    public List<Tienda> Consulta(){

        return itiendaService.findall();
    }
}
