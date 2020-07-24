package com.curso.dao;

import org.springframework.stereotype.Repository;

import com.curso.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
