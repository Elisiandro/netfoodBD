package br.com.netfood_2.rnval;


import br.com.netfood_2.entity.Produto;
import br.com.netfood_2.infra.ValidacaoRN;

public class ProdutoRNVal  implements ValidacaoRN<Produto>{

    @Override
    public void validarSalvar(Produto bean) {
           if (bean.getNome() == null) {
            throw new RuntimeException("Campo Nome nao informado");
        }
        if (bean.getPreco()== 0 ) {
            throw new RuntimeException("Campo Preco nao deve ser zero");
        }
    }

    @Override
    public void validarExcluir(Produto bean) {
           validarConsultar(bean);
    }

    @Override
    public void validarConsultar(Produto bean) {
        
        if (bean.getNome() == null || bean.getNome()== "")
        {
            throw new RuntimeException("Nome do produto invalido");        
        }
    }

    @Override
    public void validarAlterar(Produto bean) {
           validarSalvar(bean);
    }

    
}
