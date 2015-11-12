package br.com.netfood_2.rnval;

import br.com.netfood_2.entity.ItemPedido;

public class ItemPedidoRNVal {

    public void validarSalvar(ItemPedido itemPedido) {
        
        if (itemPedido.getProduto()== null) {
            throw new RuntimeException("Campo Produto nÃ£o informado");
        }
        if (itemPedido.getQuantidade()== 0) {
            throw new RuntimeException("Campo Quantidade nÃ£o informado");
        }
        if (itemPedido.getValorTotal() == 0) {
            throw new RuntimeException("Campo Valor total nÃ£o informado");
        }

    }

}
