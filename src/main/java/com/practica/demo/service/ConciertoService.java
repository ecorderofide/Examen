/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.demo.service;

import com.practica.demo.entity.Concierto;
import com.practica.demo.repository.ConciertoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jacos
 */
@Service
public class ConciertoService implements IConciertoService{
    @Autowired
    private ConciertoRepository conciertoRepository;

    @Override
    public List<Concierto> getAllConcierto() {
        return (List<Concierto>)conciertoRepository.findAll();

    }

    @Override
    public Concierto getConciertoById(long id) {
        return conciertoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveConcierto(Concierto concierto) {
        conciertoRepository.save(concierto);
        
    }

    @Override
    public void delete(long id) {
        conciertoRepository.deleteById(id);
    }
    
}
