package com.agenda.parroquia.service;

import java.util.List;

import com.agenda.parroquia.entidades.Parroquia;

public interface ParroquiaService {
	
	void guardarParroquia(Parroquia parroquia);
	
	List<Parroquia> ListaParroquias();
	
	Parroquia parroquia(Integer id);
}
