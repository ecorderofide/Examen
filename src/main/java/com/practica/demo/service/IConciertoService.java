/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica.demo.service;

import java.util.List;
import com.practica.demo.entity.Concierto;

/**
 *
 * @author jacos
 */
public interface IConciertoService {
    public List<Concierto> getAllConcierto();
    public Concierto getConciertoById(long id);
    public void saveConcierto(Concierto concierto);
    public void delete (long id);
}
