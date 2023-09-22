package com.agenda.parroquia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.parroquia.entidades.Parroquia;
import com.agenda.parroquia.repository.ParroquiRepository;


@Service
public class ParroquiaServiceImp implements ParroquiaService{

	
	@Autowired
	private ParroquiRepository parroquiRepository;
	
	@Override
	public void guardarParroquia(Parroquia parroquia) {
		parroquiRepository.save(parroquia);
		
	}

	@Override
	public List<Parroquia> ListaParroquias() {
	
		return parroquiRepository.findAll();
	}

	@Override
	public Parroquia parroquia(Integer id) {
	
		return parroquiRepository.findById(id).orElse(null);
	}

}
