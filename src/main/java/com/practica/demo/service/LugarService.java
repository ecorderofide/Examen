/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.demo.service;

import com.practica.demo.entity.Lugar;
import com.practica.demo.repository.LugarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jacos
 */
@Service
public class LugarService implements ILugarService{
    @Autowired
    private LugarRepository lugarRepository;
    @Override
    public List<Lugar> getAllLugar() {
        return (List<Lugar>)lugarRepository.findAll();
    }

    
}
