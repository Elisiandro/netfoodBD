package br.com.netfood_2.rnval;

import br.com.netfood_2.entity.Mesa;
import br.com.netfood_2.infra.ValidacaoRN;

public class MesaRNVal implements ValidacaoRN<Mesa> {
    
    @Override
    public void validarSalvar(Mesa bean) {
       if (bean.getCapacidade() == 0) {
            throw new RuntimeException("Campo Capacidade não pode ser 0 (zero)");
        }
    }
    
    @Override
    public void validarExcluir(Mesa bean) {
        validarConsultar(bean);
    }

    @Override
    public void validarConsultar(Mesa bean) {
        if (bean.getId() == null || bean.getId() == 0 )
        {
            throw new RuntimeException("Numero da mesa invalido");
        }
    }

    @Override
    public void validarAlterar(Mesa bean) {
        validarSalvar(bean);
    }

    

}
