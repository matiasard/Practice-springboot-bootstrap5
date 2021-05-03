package ar.edu.unju.fi.tp4.service.imp;

import java.time.LocalDate;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp4.model.Cliente;
import ar.edu.unju.fi.tp4.service.IClienteService;
import ar.edu.unju.fi.tp4.util.TablaClient;

@Service ("clienteUtilService")
public class ClienteServiceImp implements IClienteService{
	
	private static final Log LOOGER = LogFactory.getLog(ClienteServiceImp.class);

	//* Instancio en la variable "clientes" con la Clase "TablaCliente", para acceder al ArrayList "listaClientes" y asignarles los valores a esa lista.
	//private List<Cliente> clientesL = TablaClient.listaClientes;
	private List<Cliente> clientesL;

	
	//*  MUESTRA TODOS LOS DATOS DE LA LISTA
	@Override
	public List<Cliente> listarClientes() {
		//* Retornar la Lista Cliente
		return clientesL;
		}

	@Override
	//*  GUARDAR DATOS
	public void addCliente(Cliente clienteL) {
		//* EN CASO DE QUE NO TENGA DATOS Y EVITAR QUE DEVUELVA NULL:
		//* Creamos una Condicinal (if), ENTONCES LE MOSTRAMOS UNA LISTA CON DATOS POR DEFECTO (generarListaCliente)
		if(clientesL == null) {
			generarTablaClientes();
		}
		//* En Caso de que haya INGRESADO DATOS, SE PROCEDE A GUARDAR EN LA LISTA
		clientesL.add(clienteL);
		
		LOOGER.info("METHOD:  addCliente - Se agrego un Objeto a la Lista -> "+ clientesL.get(clientesL.size()-1));
				
		
	}
	@Override
	//*  GENERAR TABLA, EN CASO DE QUE EL USUARIO NO INGRESE VALOR PARA MOSTRARLO POR DEFECTO.
	public void generarTablaClientes() {
		clientesL = TablaClient.listaClientes;
		clientesL.add(new Cliente("DNI", 44141412, "Lucas Mateos".toUpperCase(), "email@gmail.com", "12344321", LocalDate.of(1998, 9, 9), 22, 388, 4404444, LocalDate.of(2019, 2, 22)));
	}


	
	
	
}
