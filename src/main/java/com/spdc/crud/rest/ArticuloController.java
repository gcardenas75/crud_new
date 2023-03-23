package com.spdc.crud.rest;


import com.spdc.crud.models.Articulo;
import com.spdc.crud.models.Categoria;
import com.spdc.crud.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/articulo")
public class ArticuloController {

    @Autowired
    private ArticuloService articuloService;

    @RequestMapping("/listaArticulo")
    public String listarProductos (Model model){
        List<Articulo> listadoDeProductos = articuloService.listar();
        model.addAttribute("listadoDeProductos", listadoDeProductos);
        return "listaArticulo";
    }

    @GetMapping
    public List<Articulo> listarArticulos(){
        return articuloService.listar();
    }

    @PostMapping
    public Articulo crearArticulos(@RequestBody Articulo articulo){
        return articuloService.crear(articulo);
    }

    @PutMapping
    public Articulo editarArticulo (@RequestBody Articulo articulo){
        return articuloService.editar(articulo);
    }

    @DeleteMapping
    public void EliminarArticulo(@RequestBody Articulo articulo){
        articuloService.eliminar(articulo);
    }


}
