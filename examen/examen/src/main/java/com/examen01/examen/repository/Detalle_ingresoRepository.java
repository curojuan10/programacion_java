package com.examen01.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen01.examen.entity.Detalle_ingreso;
@Repository

public interface Detalle_ingresoRepository extends JpaRepository<Detalle_ingreso, String> {

}
