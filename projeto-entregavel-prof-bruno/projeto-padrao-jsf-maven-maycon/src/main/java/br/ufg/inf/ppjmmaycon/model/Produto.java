package br.ufg.inf.ppjmmaycon.model;

/**
 *
 * @author Maycon Spirlandelli
 */
public class Produto {

    private Integer id;
    private String descricao;
    private String ncm;
    private double valor;
    private double precoCompra;
    private double lucro;
    //TODO: private GrupoProdutoBean grupoProdutoBean;

    public Produto() {
    }

    public Produto(Integer id,
            String descricao,
            String ncm,
            double valor,
            double precoCompra,
            double lucro) {
        this.id = id;
        this.descricao = descricao;
        this.ncm = ncm;
        this.valor = valor;
        this.precoCompra = precoCompra;
        this.lucro = lucro;
    }

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

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }
}
