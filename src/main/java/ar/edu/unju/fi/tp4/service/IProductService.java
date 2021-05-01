package ar.edu.unju.fi.tp4.service;

import ar.edu.unju.fi.tp4.model.Producto;

public interface IProductService {
	
	public void addProducto(Producto producto);
	
	public Producto getUltimoProducto();
	
	// Para el 1er GetMapping
	public Producto getProducto();
	
}
