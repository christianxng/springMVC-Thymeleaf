package com.curso.service;

import java.util.List;

import com.curso.domain.Departamento;

public interface DerpartamentoService {
	
	void salvar(Departamento departamento);
	void editar(Departamento departamento);
	void excluir(Long id);
	Departamento buscarPorId(Long id);
	List<Departamento>buscarTodos();

}
