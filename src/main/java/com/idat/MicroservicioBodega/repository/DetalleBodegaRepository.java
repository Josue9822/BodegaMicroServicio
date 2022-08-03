package com.idat.MicroservicioBodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.MicroservicioBodega.model.BodegaDetalle;

public interface DetalleBodegaRepository extends JpaRepository<BodegaDetalle, Integer>{

}
