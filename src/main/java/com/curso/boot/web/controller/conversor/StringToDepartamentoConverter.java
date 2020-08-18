package com.curso.boot.web.controller.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.curso.boot.domain.Departamento;
import com.curso.boot.service.DepartamentoService;
@Component
public class StringToDepartamentoConverter implements Converter<String, Departamento> {

	@Autowired
	private DepartamentoService serviceDepartamento;
	
	@Override
	public Departamento convert(String texto) {
		
		if(texto.isEmpty()) {
			return null;
		}
		
		return serviceDepartamento.buscarPorId(Long.valueOf(texto));
	}

}
