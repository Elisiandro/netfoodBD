package br.com.netfood_2.rnval;

import br.com.netfood_2.entity.Mesa;
import br.com.netfood_2.entity.Pedido;
import br.com.netfood_2.infra.ValidacaoRN;

public class PedidoRNVal implements ValidacaoRN<Pedido> {

    @Override
    public void validarSalvar(Pedido bean) {
        if (bean.getGarcom() == null) {
            throw new RuntimeException("Campo garcom não informado");
        }
        if (bean.getListaItens() == null) {
            throw new RuntimeException("Campo Itens não informado");
        }
        if (bean.getMesa() == null) {
            throw new RuntimeException("Campo Mesa não informado");
        }
        if (bean.getValorPago() == 0) {
            throw new RuntimeException("Campo Valor Pago não informado");
        }

    }

    @Override
    public void validarExcluir(Pedido bean) {
        validarConsultar(bean);
    }

    @Override
    public void validarConsultar(Pedido bean) {
        if (bean.getId() == null || bean.getId() == 0 )
        {
            throw new RuntimeException("Numero do pedido invalido");
        }
    }

    @Override
    public void validarAlterar(Pedido bean) {
        validarSalvar(bean);
    }

}
