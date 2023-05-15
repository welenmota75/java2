package br.edu.ifsp.controller;

import java.util.List;

import br.edu.ifsp.model.departamento.Departamento;
import br.edu.ifsp.dao.DepartamentoDao;

public class DepartamentoController {
    
    private DepartamentoDao departamentoDao;
    
    public DepartamentoController() {
        departamentoDao = new DepartamentoDao();
    }
    
    public String insereDepartamento(Departamento departamento) {
        return departamentoDao.insereDepartamento(departamento);
    }
    
    public Departamento buscaDepartamento(int id) {
        return departamentoDao.buscaDepartamento(id);
    }
    
    public List<Departamento> recuperaDepartamentos() {
        return departamentoDao.recuperaDepartamentos();
    }
    
    public List<Departamento> consultaDepartamento() {
        return new DepartamentoDao().recuperaDepartamentos();
    }
    
    public String getExcecao() {
        return new DepartamentoDao().getExcecao();
    }
}
