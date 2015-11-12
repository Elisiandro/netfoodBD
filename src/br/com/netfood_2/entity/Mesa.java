
package br.com.netfood_2.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Elisiandro
 */
@Entity
@Table(name = "mesa")
public class Mesa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;    
    private int capacidade;

    //
    //Construtor
    //
    public Mesa(int capacidade) {
        this.capacidade = capacidade;
    }

    public Mesa() {
    }
    
    
    
    
    //
    //Get e Set
    //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
   

}
