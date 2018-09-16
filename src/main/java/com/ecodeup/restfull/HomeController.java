package com.ecodeup.restfull;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecodeup.modelo.Estudiante;

@RestController
public class HomeController {
	
	
	@RequestMapping("/obtener")
	public List<Estudiante>  getAll(){
		List<Estudiante> lista= new ArrayList<>();
		
		Estudiante e1 = new Estudiante(1, "Carlos", "Vera");
		lista.add(e1);

		Estudiante e2 = new Estudiante(2, "Marcos", "Andrade");
		lista.add(e2);
		
		Estudiante e3 = new Estudiante(2, "Julio", "Cortazar");
		lista.add(e2);
		
		return lista;
	}
	
}
