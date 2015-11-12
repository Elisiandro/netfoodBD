package br.com.netfood_2.rnval;

import br.com.netfood_2.entity.Produto;

public class ProdutoRNVal {

    public void validarSalvar(Produto produto) {
        if (produto.getNome() == null) {
            throw new RuntimeException("Campo Nome nÃ£o informado");
        }
        if (produto.getPreco()== 0 ) {
            throw new RuntimeException("Campo Preco nÃ£o deve ser zero");
        }
    }

}
