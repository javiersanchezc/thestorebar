package com.jscoder.app.controller;


import com.jscoder.app.repository.entity.Producto;
import com.jscoder.app.service.IproductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class productoController {

    @Autowired
    IproductoService iproductoService;

    @GetMapping("/productos")
    List<Producto> Consulta(){

        return iproductoService.findall();
    }


}
