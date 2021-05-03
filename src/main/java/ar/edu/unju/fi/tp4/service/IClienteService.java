package ar.edu.unju.fi.tp4.service;

import java.util.List;

import ar.edu.unju.fi.tp4.model.Cliente;

public interface IClienteService {

	public void addCliente(Cliente clienteL);
	
	//*  Retorna una Lista del Cliente
	public List<Cliente> listarClientes();
	
	//*  Agregara Cliente de entradas para trabajar con la vista 
	public void generarTablaClientes();
	
	
}
