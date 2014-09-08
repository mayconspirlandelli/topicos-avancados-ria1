package br.ufg.inf.ppjmmaycon.bean;

/**
 *
 * @author Maycon Spirlandelli
 */
public class ProdutoBean {
    
    private Integer id;
    private String descricao;
    private String ncm;
    private double valor;
    private double precoCompra;
    private double lucro;
    //TODO: private GrupoProdutoBean grupoProdutoBean;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }    
}
