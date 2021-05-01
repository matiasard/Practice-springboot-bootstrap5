package ar.edu.unju.fi.tp4.controller;

//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp4.model.Producto;
import ar.edu.unju.fi.tp4.service.IProductService;

@Controller
public class ProductoController {
	
	
	
	@Autowired
	IProductService productoService;
	
	@GetMapping("/producto")
	public String getProductoForm(Model model) {
		model.addAttribute("formProducto", productoService.getProducto());//producto de Service
		return "nuevo";
	}
	
	@PostMapping("/producto/guardar")
	public String getProductoResultado(@ModelAttribute ("formProducto") Producto pProducto) {
		productoService.addProducto(pProducto);
		return "resultado";
	}

	@GetMapping("/producto/ultimo")
	public ModelAndView getUltimoProducto() {
		ModelAndView mv = new ModelAndView ("ultimoproducto");
		mv.addObject("formProducto", productoService.getUltimoProducto());
		return mv;
	}
	
}

