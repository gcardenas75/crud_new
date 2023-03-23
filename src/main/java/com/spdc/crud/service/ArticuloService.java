package com.spdc.crud.service;
import com.spdc.crud.models.Articulo;
import com.spdc.crud.repository.IArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloService {

    @Autowired
    private IArticuloRepository iArticuloRepository;

    public List<Articulo> listar() {
        return iArticuloRepository.findAll();
    }

    public Articulo crear(Articulo articulo){
        return iArticuloRepository.save(articulo);
    }

    public Articulo editar(Articulo articulo){
        return iArticuloRepository.save(articulo);
    }

    public void eliminar (Articulo articulo){
        iArticuloRepository.delete(articulo);
    }
}
