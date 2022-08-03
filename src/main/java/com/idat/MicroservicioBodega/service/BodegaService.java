package com.idat.MicroservicioBodega.service;

import java.util.List;

import com.idat.MicroservicioBodega.model.Bodega;

public interface BodegaService {
	
	List<Bodega> listarBodega();
	void asignarProductoBodega();

}
