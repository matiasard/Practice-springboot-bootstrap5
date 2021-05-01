package ar.edu.unju.fi.tp4.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp4.model.Producto;
import ar.edu.unju.fi.tp4.service.IProductService;

@Service
public class ProductoServiceImp implements IProductService {
	
	// Trazas de la Clase "ProductoServiciceImp" para ver la accion de agregado de Productos
	private static final Log LOGGER = LogFactory.getLog(ProductoServiceImp.class);

	@Autowired
	Producto producto;
	
	List<Producto> productos = new ArrayList<Producto>();
	
	@Override
	public void addProducto(Producto producto) {
		this.productos.add(producto);
		// Seguimiento de la accion agregar Producto
		LOGGER.info("\nMETHOD: agregarProducto - se agrego un objto producto en la lista -> "+productos.get(productos.size()-1));
	}

	@Override
	public Producto getUltimoProducto() {
		// Saca el Ultimo Elemento de la Lista
		int ultimoElemento = productos.size() - 1;
		// get(): Para Acceder a un Elemento especifico, en este caso al ultimo.
		Producto productoList = productos.get(ultimoElemento);
		return productoList;
	}
	
	// Para el 1er GetMapping
	@Override
	public Producto getProducto() {
		return this.producto;
	}

	
}
