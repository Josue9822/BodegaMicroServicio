package com.idat.MicroservicioBodega.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MicroservicioBodega.client.OpenFeignClient;
import com.idat.MicroservicioBodega.model.Bodega;
import com.idat.MicroservicioBodega.model.BodegaDetalle;
import com.idat.MicroservicioBodega.model.Producto;
import com.idat.MicroservicioBodega.model.ProductoBodegaFK;
import com.idat.MicroservicioBodega.repository.BodegaRepository;
import com.idat.MicroservicioBodega.repository.DetalleBodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService{
	
	@Autowired
	private BodegaRepository repositoryBodega;
	
	@Autowired
	private DetalleBodegaRepository repositoryDetalle;
	
	@Autowired
	private OpenFeignClient feign;

	@Override
	public List<Bodega> listarBodega() {
		return repositoryBodega.findAll();
	}

	@Override
	public void asignarProductoBodega() {
		List<Producto> listado = feign.listarProductosSeleccionados();
		ProductoBodegaFK fk = null;
		BodegaDetalle detalle = null;
		
		for (Producto producto : listado) {
			
			fk = new ProductoBodegaFK();
			fk.setIdProducto(producto.getIdProducto());
			fk.setIdBodega(1);
			
			detalle = new BodegaDetalle();
			detalle.setFk(fk);
			
			repositoryDetalle.save(detalle);
			
		}
		
	}
	
	
	
	

}
