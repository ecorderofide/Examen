/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.demo.controller;

import com.practica.demo.entity.Artista;
import com.practica.demo.entity.Concierto;
import com.practica.demo.entity.Lugar;
import com.practica.demo.service.IArtistaService;
import com.practica.demo.service.IConciertoService;
import com.practica.demo.service.ILugarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author jacos
 */
@Controller
public class ConciertoController {
    @Autowired
    private IConciertoService conciertoService;
    @Autowired
    private IArtistaService artistaService;
    @Autowired
    private ILugarService lugarService;
    
    @GetMapping("/concierto")
    public String index(Model model){
        List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        model.addAttribute("titulo", "Tabla Conciertos");
        model.addAttribute("personas", listaConcierto);
        return "conciertos";
    }
    
    @GetMapping("/conciertoN")
    public String crearConcierto(Model model){
        List<Artista> listaArtista = artistaService.getAllArtista();
        List<Lugar> listaLugares = lugarService.getAllLugar();
        model.addAttribute("concierto", new Concierto());
        model.addAttribute("artistas", listaArtista);
        model.addAttribute("lugares", listaLugares);
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Concierto concierto){
        conciertoService.saveConcierto(concierto);
        return "redirect:/persona";
    }
    
    @GetMapping("/editConcierto/{id}")
    public String editarPersona(@PathVariable("id") Long idConcierto, Model model){
        Concierto concierto = conciertoService.getConciertoById(idConcierto);
        List<Artista> listaArtistas = artistaService.getAllArtista();
        List<Lugar> listaLugares = lugarService.getAllLugar();
        model.addAttribute("concierto", concierto);
        model.addAttribute("artistas", listaArtistas);
        model.addAttribute("lugares", listaLugares);
        return "crear";   
    }
    
    @GetMapping("/deleteConcierto/{id}")
    public String eliminarPersona(@PathVariable("id") Long idConcierto){
        conciertoService.delete(idConcierto);
        return "redirect:/concierto";   
    }
}
