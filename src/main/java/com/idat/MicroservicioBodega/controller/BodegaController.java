package com.idat.MicroservicioBodega.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.MicroservicioBodega.model.Bodega;
import com.idat.MicroservicioBodega.service.BodegaService;

@RestController
@RequestMapping("/api/bodega/v1")
public class BodegaController {
	
	@Autowired
	private BodegaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Bodega> listar(){
		return service.listarBodega();
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarProductosBodega() {
		
		service.asignarProductoBodega();
	}

}
