package br.com.netfood_2.rnval;

import br.com.netfood_2.entity.ItemPedido;
import br.com.netfood_2.infra.ValidacaoRN;

public class ItemPedidoRNVal  implements ValidacaoRN<ItemPedido> {

    @Override
    public void validarSalvar(ItemPedido bean) {
        if (bean.getProduto()== null) {
            throw new RuntimeException("Campo Produto nao informado");
        }
        if (bean.getQuantidade()== 0) {
            throw new RuntimeException("Campo Quantidade nao informado");
        }
        if (bean.getValorTotal() == 0) {
            throw new RuntimeException("Campo Valor total nao informado");
        }

    }

    @Override
    public void validarExcluir(ItemPedido bean) {
        validarConsultar(bean);
    }

    @Override
    public void validarConsultar(ItemPedido bean) {
        if (bean.getId() == null || bean.getId() == 0) {
            throw new RuntimeException("Item do pedido invalido");
        }        
    }

    @Override
    public void validarAlterar(ItemPedido bean) {
        validarSalvar(bean);
    }

    
}
