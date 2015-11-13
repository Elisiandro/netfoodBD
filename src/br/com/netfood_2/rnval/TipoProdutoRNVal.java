package br.com.netfood_2.rnval;

import br.com.netfood_2.entity.Garcom;
import br.com.netfood_2.entity.TipoProduto;
import br.com.netfood_2.infra.ValidacaoRN;

public class TipoProdutoRNVal implements ValidacaoRN<TipoProduto> {

    @Override
    public void validarSalvar(TipoProduto bean) {
        if (bean.getDescricao() == null || bean.getDescricao() == "") {
            throw new RuntimeException("Campo Descricao não informado");
        }
    }

    @Override
    public void validarExcluir(TipoProduto bean) {
        validarConsultar(bean);
    }

    @Override
    public void validarConsultar(TipoProduto bean) {
        if (bean.getDescricao() == null || bean.getDescricao() == "") {
            throw new RuntimeException("Descricao do tipo de produto invalida");
        }
    }

    @Override
    public void validarAlterar(TipoProduto bean) {
        validarSalvar(bean);
    }

    

}
