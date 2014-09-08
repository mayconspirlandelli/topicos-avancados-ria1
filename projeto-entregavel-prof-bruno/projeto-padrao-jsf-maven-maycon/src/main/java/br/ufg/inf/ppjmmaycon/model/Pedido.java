package br.ufg.inf.ppjmmaycon.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Maycon Spirlandelli
 */
public class Pedido {

    private Integer id;
    private Pessoa cliente;
    private Pessoa vendedor;
    private double valor;
    private Date data;
    private List<Produto> produtos;

    public Pedido() {
    }

    public Pedido(Integer id, Pessoa cliente, Pessoa vendedor, double valor, Date data) {
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.valor = valor;
        this.data = data;
    }   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Pessoa getVendedor() {
        return vendedor;
    }

    public void setVendedor(Pessoa vendedor) {
        this.vendedor = vendedor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
