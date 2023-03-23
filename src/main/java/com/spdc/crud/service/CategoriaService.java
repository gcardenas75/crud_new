package com.spdc.crud.service;

import com.spdc.crud.models.Categoria;
import com.spdc.crud.repository.ICategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private ICategoriaRepository iCategoriaRepository;

    public List<Categoria> listar(){
        return iCategoriaRepository.findAll();
    }

    public Categoria crear(Categoria categoria){
        return iCategoriaRepository.save(categoria);
    }

    public Categoria editar (Categoria categoria){
        return iCategoriaRepository.save(categoria);
    }

    public void eliminar(Categoria categoria){
        iCategoriaRepository.delete(categoria);
    }




}
