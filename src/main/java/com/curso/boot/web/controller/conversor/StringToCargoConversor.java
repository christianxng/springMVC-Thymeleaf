package com.curso.boot.web.controller.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.curso.boot.domain.Cargo;
import com.curso.boot.service.CargoService;
@Component
public class StringToCargoConversor implements Converter<String, Cargo>{	

		@Autowired
		CargoService serviceCargo;			
	
		@Override
		public Cargo convert(String texto) {
			if(texto.isEmpty()) {
				return null;
			}
			return serviceCargo.buscarPorId(Long.valueOf(texto));
			
		}
}
