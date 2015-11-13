package br.com.netfood_2.rnval;

import br.com.netfood_2.entity.Garcom;
import br.com.netfood_2.infra.ValidacaoRN;

public class GarcomRNVal implements ValidacaoRN<Garcom>{

    @Override
    public void validarSalvar(Garcom bean) {
        if (bean.getNome() == null) {
            throw new RuntimeException("Campo Nome nao informado");
        }
        if (bean.getCpf() == null) {
            throw new RuntimeException("Campo Cpf nao informado");
        }
        if (bean.getSalario() == 0) {
            throw new RuntimeException("Campo E-mail nao informado");
        }

    }

    @Override
    public void validarExcluir(Garcom bean) {
        validarConsultar(bean);
    }

    @Override
    public void validarConsultar(Garcom bean) {
        if (bean.getNome() == null || bean.getNome() == "" )
        {
            throw new RuntimeException("Nome do garcom invalido");
        }
    }

    @Override
    public void validarAlterar(Garcom bean) {
           validarSalvar(bean);
    }

    

}
