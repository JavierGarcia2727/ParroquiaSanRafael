package com.agenda.parroquia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.agenda.parroquia.entidades.Parroquia;
import com.agenda.parroquia.service.ParroquiaService;



@Controller
@RequestMapping("/Parroquia")
public class ParroquiaController {
	
	
	@Autowired
	private ParroquiaService parroquiaService;
	
	
	@GetMapping("/inicio")
	public String Parroquia(Model model) {
		Parroquia parroquia = new Parroquia();
		model.addAttribute("parroquia", parroquia);
		return "Parroquia";
	}
	
	
	@GetMapping("/ListaParroquia")
	
	public String ListaParroquia(Model model){
		
		List<Parroquia> listaParroquia=parroquiaService.ListaParroquias();
		
		model.addAttribute("listaParroquia", listaParroquia);
		
		return "ListaParroquias";
	}
	
	
	@PostMapping("/guardar")
	public String GuardarPElicula(Parroquia parroquia) {
		
		parroquiaService.guardarParroquia(parroquia);
		
		return "redirect:/Parroquia/inicio";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
