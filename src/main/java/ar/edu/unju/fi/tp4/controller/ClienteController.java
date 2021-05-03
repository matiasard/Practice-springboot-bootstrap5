package ar.edu.unju.fi.tp4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp4.model.Cliente;
import ar.edu.unju.fi.tp4.service.IClienteService;

// Notacion de Spring: Controller
@Controller
public class ClienteController {

	@Autowired
	@Qualifier("clienteUtilService")
	private IClienteService clienteService;

	@Autowired
	private Cliente clienteModel;

	@GetMapping("/cliente/nuevo")
	public String getNuevoCliente(Model model) {
		//* AGREGAR Atributos al model (Cliente)
		model.addAttribute("formCliente", clienteModel);

		return "nuevocliente";
	}

	//p2 == => ==>  <== <= >= <>
	@PostMapping("/cliente/guardar")
	public ModelAndView getClienteGuardar(@ModelAttribute("formCliente") Cliente paramCliente) {

		ModelAndView mv = new ModelAndView("cliente");
		clienteService.addCliente(paramCliente); //  GUARDA LOS DATOS INVOCANDO AL METODO DEL SERVICIO "AGREGAR CLIENTE"
		mv.addObject("formCliente", clienteService.listarClientes());
		return mv;
	}

	@GetMapping("/cliente/listado")
	public ModelAndView getClienteListado(){
		ModelAndView mv = new ModelAndView("cliente");
		if (clienteService.listarClientes() == null) {
			// En caso de que no resiva ningun parametro. se mostrara una lista con valores por defectos
			clienteService.generarTablaClientes();
		}
		mv.addObject("formCliente", clienteService.listarClientes());
		return mv;
	}


}
