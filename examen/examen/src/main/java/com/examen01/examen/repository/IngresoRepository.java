package com.examen01.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen01.examen.entity.Ingreso;
@Repository
public interface IngresoRepository  extends JpaRepository<Ingreso,String>{

}
