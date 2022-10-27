/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica.demo.repository;


import com.practica.demo.entity.Lugar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jacos
 */
@Repository
public interface LugarRepository extends CrudRepository<Lugar,Long>{
    
}
