package com.idat.MicroservicioBodega.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_bodega")
public class BodegaDetalle {
	
	@Id
	private ProductoBodegaFK fk = new ProductoBodegaFK();

	public ProductoBodegaFK getFk() {
		return fk;
	}

	public void setFk(ProductoBodegaFK fk) {
		this.fk = fk;
	}
	
	

}
