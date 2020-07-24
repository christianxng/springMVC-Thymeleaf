package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.curso.dao.DepartamentoDao;
import com.curso.domain.Departamento;

@Service
@Transactional(readOnly = false)
public class DepartamentoServiceImpl implements DerpartamentoService{

	
	@Autowired
	DepartamentoDao departamentoDao;
	
	
	@Override
	public void salvar(Departamento departamento) {
		departamentoDao.save(departamento);
	}

	@Override
	public void editar(Departamento departamento) {
		departamentoDao.update(departamento);
	}

	@Override
	public void excluir(Long id) {
		departamentoDao.delete(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Departamento buscarPorId(Long id) {
		return departamentoDao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Departamento> buscarTodos() {
		return departamentoDao.findAll();
	}

}
