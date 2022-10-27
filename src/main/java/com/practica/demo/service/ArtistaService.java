/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.demo.service;

import com.practica.demo.entity.Artista;
import com.practica.demo.repository.ArtistaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jacos
 */
@Service
public class ArtistaService implements IArtistaService{
    @Autowired
    private ArtistaRepository artistaRepository;

    @Override
    public List<Artista> getAllArtista() {
        return (List<Artista>)artistaRepository.findAll();
    }
    
}
