package com.spdc.crud.rest;


import com.spdc.crud.models.Categoria;
import com.spdc.crud.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/categoria")
public class CategoriaController {


    @Autowired
    private CategoriaService categoriaService;



    @GetMapping
    public List<Categoria> listarCategoria(){
        return categoriaService.listar();
    }


    @PostMapping
    public Categoria crearCategoria(@RequestBody Categoria categoria){
        return categoriaService.crear(categoria);
    }

    @PutMapping
    public Categoria editarCategoria(@RequestBody Categoria categoria){
        return categoriaService.editar(categoria);
    }

    @DeleteMapping
    public void eliminarCategoria (@RequestBody Categoria categoria){
        categoriaService.eliminar(categoria);
    }
}
