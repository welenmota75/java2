package br.edu.ifsp.controller;

import java.util.List;

import br.edu.ifsp.dao.CargoDao;
import br.edu.ifsp.dao.FuncionarioDao;
import br.edu.ifsp.model.cargo.Cargo;
import br.edu.ifsp.model.cargo.CargoValidacao;
import br.edu.ifsp.model.funcionario.Funcionario;

public class CargoController {

    public List<Cargo> consultaCargos() {
        return new CargoDao().recuperaCargos();
    }
    
    public String insereCargo(Cargo cargo) {
        String mensagem = null;
        List<String> erros = CargoValidacao.validaCargo(cargo);
        
        if (erros.isEmpty()) {
            mensagem = new CargoDao().insereCargo(cargo);
        } else {
            mensagem = "Erros de validação encontrados:";
            for (String erro : erros) {
                mensagem += "\n- " + erro;
            }
        }
        
        return mensagem;
    }
    
    
    public String getExcecao() {
        return new CargoDao().getExcecao();
    }
    
    public List<Cargo> consultaCargo() {
		return new CargoDao().consultaCargos();
    }
}
