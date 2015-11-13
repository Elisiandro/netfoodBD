
package br.com.netfood_2.infra;

/**
 * 
 * @author Elisiandro
 * @param <T> 
 */
public interface ValidacaoRN<T> {
    void validarSalvar(T bean);
    void validarExcluir(T bean);
    void validarConsultar(T bean);
    void validarAlterar(T bean);
}
