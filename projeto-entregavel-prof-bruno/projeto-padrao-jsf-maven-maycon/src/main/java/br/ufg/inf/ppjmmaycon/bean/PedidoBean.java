package br.ufg.inf.ppjmmaycon.bean;

import br.ufg.inf.ppjmmaycon.model.Produto;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Maycon Spirlandelli
 */
@ManagedBean
public class PedidoBean {
    
    private Integer id;
    private PessoaBean cliente;
    private PessoaBean vendedor;
    private double valor;
    private Date data;
    private List<Produto> produtos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PessoaBean getCliente() {
        return cliente;
    }

    public void setCliente(PessoaBean cliente) {
        this.cliente = cliente;
    }

    public PessoaBean getVendedor() {
        return vendedor;
    }

    public void setVendedor(PessoaBean vendedor) {
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
