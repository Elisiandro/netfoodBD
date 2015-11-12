/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.netfood_2.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Elisiandro
 */
@Entity
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToOne(cascade = CascadeType.MERGE)
    private Garcom garcom;
    
    @OneToOne(cascade = CascadeType.MERGE)
    private Mesa mesa;
    
    @Temporal(TemporalType.DATE)
    private Date dataPedido;

    private boolean aberto;
    private double valorCosumo;
    private int comissao;
    private double valorPago;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="PEDIDO_ID")
    private List<ItemPedido> listaItens = new ArrayList<>();

    
    //
    //Construtor
    //
    public Pedido() {
    }

    public Pedido(Garcom garcom, Mesa mesa, boolean aberto, double valorCosumo, int comissao, double valorPago) {
        this.garcom = garcom;
        this.mesa = mesa;
        this.aberto = aberto;
        this.valorCosumo = valorCosumo;
        this.comissao = comissao;
        this.valorPago = valorPago;
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

    public Garcom getGarcom() {
        return garcom;
    }

    public void setGarcom(Garcom garcom) {
        this.garcom = garcom;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public double getValorCosumo() {
        return valorCosumo;
    }

    public void setValorCosumo(double valorCosumo) {
        this.valorCosumo = valorCosumo;
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public List<ItemPedido> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<ItemPedido> listaItens) {
        this.listaItens = listaItens;
    }
    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }
}
