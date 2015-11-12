package br.com.netfood_2.entity;

import java.io.Serializable;
import javax.persistence.Basic;
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
@Table(name = "garcom")
public class Garcom implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long id;    
    @Column(length = 60)
    private String nome;    
    private double salario;    
    @Column(length = 11)
    private String cpf;

   
    
    //
    //Construtor
    //
    public Garcom(String nome, double salario, String cpf) {        
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;        
    }

    public Garcom() {
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    

}
