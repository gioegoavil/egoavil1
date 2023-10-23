package pe.edu.utp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pe.edu.utp.model.Empleado;

@Controller
public class EmpleadoController {
	@Autowired
	private Empleado emp;
	@GetMapping("/nuevo")
	public String nuevoEmpleado(Model modelo) {
		
		modelo.addAttribute("empleado" , emp);
		return "formulario";
		
	}
}
